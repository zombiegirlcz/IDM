package com.fourthline.orca.internal;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import com.fourthline.core.ContextExtensionsKt;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URI;
import java.util.UUID;
import kotlin.NotImplementedError;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes23.dex */
public final class qx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f32549a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ContentResolver f32550b;

    public static final class a extends gim.i implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f32551a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Uri f32553c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Uri uri2, Continuation continuation) {
            super(2, continuation);
            this.f32553c = uri2;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
        }

        @Override // gim.a
        public final Continuation create(Object obj2, Continuation continuation) {
            return qx.this.new a(this.f32553c, continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(Object obj2) throws Exception {
            fim.a aVar = fim.a.COROUTINE_SUSPENDED;
            if (this.f32551a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
            try {
                InputStream inputStreamOpenInputStream = qx.this.f32550b.openInputStream(this.f32553c);
                if (inputStreamOpenInputStream != null) {
                    qx qxVar = qx.this;
                    Uri uri2 = this.f32553c;
                    try {
                        File file = new File(new File(ContextExtensionsKt.getFourthlineDirectory(qxVar.f32549a)), UUID.randomUUID() + "." + qxVar.a(uri2));
                        zi0.c.m(inputStreamOpenInputStream, new FileOutputStream(file), 8192);
                        URI uri3 = file.toURI();
                        inputStreamOpenInputStream.close();
                        if (uri3 != null) {
                            return uri3;
                        }
                    } finally {
                    }
                }
                throw new FileNotFoundException();
            } catch (Exception e) {
                e.printStackTrace();
                throw e;
            }
        }
    }

    public qx(Context context, ContentResolver contentResolver) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(contentResolver, "contentResolver");
        this.f32549a = context;
        this.f32550b = contentResolver;
    }

    public final Object a(Uri uri2, Continuation continuation) {
        skm.p0 p0Var = skm.p0.f264001a;
        return skm.e0.J(elm.f.f127540b, new a(uri2, null), continuation);
    }

    public final String a(Uri uri2) {
        Intrinsics.checkNotNullParameter(uri2, "uri");
        String type = this.f32550b.getType(uri2);
        if (type != null && type.hashCode() == -1248334925 && type.equals("application/pdf")) {
            return "pdf";
        }
        Intrinsics.checkNotNullParameter("File Writing for other types than PDF is not supported.", "message");
        throw new NotImplementedError("File Writing for other types than PDF is not supported.");
    }
}
