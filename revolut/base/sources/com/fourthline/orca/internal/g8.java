package com.fourthline.orca.internal;

import android.content.ContentResolver;
import android.graphics.ImageDecoder;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import java.io.IOException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes23.dex */
public final class g8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ContentResolver f28783a;

    public static final class a extends gim.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f28784a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f28785b;
        int d;

        public a(Continuation continuation) {
            super(continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(Object obj2) {
            this.f28785b = obj2;
            this.d |= Integer.MIN_VALUE;
            return g8.this.a(null, this);
        }
    }

    public static final class b extends gim.i implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f28787a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Uri f28789c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Uri uri2, Continuation continuation) {
            super(2, continuation);
            this.f28789c = uri2;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
        }

        @Override // gim.a
        public final Continuation create(Object obj2, Continuation continuation) {
            return g8.this.new b(this.f28789c, continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(Object obj2) throws Exception {
            fim.a aVar = fim.a.COROUTINE_SUSPENDED;
            if (this.f28787a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
            try {
                ImageDecoder.Source sourceCreateSource = ImageDecoder.createSource(g8.this.f28783a, this.f28789c);
                Intrinsics.checkNotNullExpressionValue(sourceCreateSource, "createSource(...)");
                return ImageDecoder.decodeBitmap(sourceCreateSource);
            } catch (Exception e) {
                e.printStackTrace();
                throw e;
            }
        }
    }

    public g8(ContentResolver contentResolver) {
        Intrinsics.checkNotNullParameter(contentResolver, "contentResolver");
        this.f28783a = contentResolver;
    }

    public final Long b(Uri uri2) throws IOException {
        Intrinsics.checkNotNullParameter(uri2, "uri");
        ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = this.f28783a.openFileDescriptor(uri2, "r");
        if (parcelFileDescriptorOpenFileDescriptor == null) {
            return null;
        }
        try {
            Long lValueOf = Long.valueOf(parcelFileDescriptorOpenFileDescriptor.getStatSize());
            parcelFileDescriptorOpenFileDescriptor.close();
            return lValueOf;
        } finally {
        }
    }

    public final String a(Uri uri2) {
        Intrinsics.checkNotNullParameter(uri2, "uri");
        return this.f28783a.getType(uri2);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(android.net.Uri r6, kotlin.coroutines.Continuation r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.fourthline.orca.internal.g8.a
            if (r0 == 0) goto L13
            r0 = r7
            com.fourthline.orca.internal.g8$a r0 = (com.fourthline.orca.internal.g8.a) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            com.fourthline.orca.internal.g8$a r0 = new com.fourthline.orca.internal.g8$a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f28785b
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r6 = r0.f28784a
            android.net.Uri r6 = (android.net.Uri) r6
            yhm.o.b(r7)
            goto L4b
        L2b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L33:
            yhm.o.b(r7)
            skm.p0 r7 = skm.p0.f264001a
            elm.f r7 = elm.f.f127540b
            com.fourthline.orca.internal.g8$b r2 = new com.fourthline.orca.internal.g8$b
            r4 = 0
            r2.<init>(r6, r4)
            r0.f28784a = r4
            r0.d = r3
            java.lang.Object r7 = skm.e0.J(r7, r2, r0)
            if (r7 != r1) goto L4b
            return r1
        L4b:
            java.lang.String r6 = "withContext(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r6)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fourthline.orca.internal.g8.a(android.net.Uri, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
