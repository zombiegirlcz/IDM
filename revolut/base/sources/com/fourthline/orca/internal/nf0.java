package com.fourthline.orca.internal;

import android.content.Context;
import android.net.Uri;
import com.fourthline.core.DocumentType;
import com.fourthline.orca.internal.ff0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class nf0 implements mf0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f31407a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final rd1 f31408b;

    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DocumentType.values().length];
            try {
                iArr[DocumentType.PASSPORT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DocumentType.ID_CARD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DocumentType.DRIVERS_LICENSE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[DocumentType.DUTCH_DRIVERS_LICENSE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[DocumentType.RESIDENCE_PERMIT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public nf0(Context context, rd1 videoServiceLocator) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(videoServiceLocator, "videoServiceLocator");
        this.f31407a = context;
        this.f31408b = videoServiceLocator;
    }

    private final Uri b(Context context) {
        return this.f31408b.a(vc.a(context) ? wf0.f : wf0.e);
    }

    private final Uri c(Context context) {
        return this.f31408b.a(vc.a(context) ? wf0.d : wf0.f34671c);
    }

    private final Uri d(Context context) {
        return this.f31408b.a(vc.a(context) ? wf0.f34674j : wf0.i);
    }

    @Override // com.fourthline.orca.internal.mf0, kotlin.jvm.functions.Function1
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public ff0.a.InterfaceC0196a.C0197a invoke(DocumentType documentType) {
        Uri uriC;
        Intrinsics.checkNotNullParameter(documentType, "documentType");
        int i = a.$EnumSwitchMapping$0[documentType.ordinal()];
        if (i == 1) {
            uriC = c(this.f31407a);
        } else if (i == 2) {
            uriC = b(this.f31407a);
        } else if (i == 3 || i == 4) {
            uriC = a(this.f31407a);
        } else {
            if (i != 5) {
                throw new IllegalStateException("FL Developer error. NFC scanner was instantiated with unsupported document type");
            }
            uriC = d(this.f31407a);
        }
        return new ff0.a.InterfaceC0196a.C0197a(uriC);
    }

    private final Uri a(Context context) {
        return this.f31408b.a(vc.a(context) ? wf0.f34673h : wf0.f34672g);
    }
}
