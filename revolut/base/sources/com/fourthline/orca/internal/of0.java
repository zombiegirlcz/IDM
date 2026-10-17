package com.fourthline.orca.internal;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import com.fourthline.core.DocumentType;
import com.fourthline.nfc.assets.R;
import com.fourthline.orca.internal.ff0;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class of0 implements mf0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f31659a;

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

    public of0(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f31659a = context;
    }

    private final int b(Context context) {
        return vc.a(context) ? R.raw.nfc_video_id_card_dark : R.raw.nfc_video_id_card_light;
    }

    private final int c(Context context) {
        return vc.a(context) ? R.raw.nfc_video_passport_dark : R.raw.nfc_video_passport_light;
    }

    private final int d(Context context) {
        return vc.a(context) ? a(context, R.raw.nfc_video_residence_permit_dark, R.raw.nfc_video_id_card_dark) : a(context, R.raw.nfc_video_residence_permit_light, R.raw.nfc_video_id_card_light);
    }

    @Override // com.fourthline.orca.internal.mf0, kotlin.jvm.functions.Function1
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public ff0.a.InterfaceC0196a.b invoke(DocumentType documentType) {
        int iC;
        Intrinsics.checkNotNullParameter(documentType, "documentType");
        int i = a.$EnumSwitchMapping$0[documentType.ordinal()];
        if (i == 1) {
            iC = c(this.f31659a);
        } else if (i == 2) {
            iC = b(this.f31659a);
        } else if (i == 3 || i == 4) {
            iC = a(this.f31659a);
        } else {
            if (i != 5) {
                throw new IllegalStateException("FL Developer error. NFC scanner was instantiated with unsupported document type");
            }
            iC = d(this.f31659a);
        }
        return new ff0.a.InterfaceC0196a.b(iC);
    }

    private final int a(Context context) {
        if (vc.a(context)) {
            return a(context, R.raw.nfc_video_drivers_license_dark, R.raw.nfc_video_id_card_dark);
        }
        return a(context, R.raw.nfc_video_drivers_license_light, R.raw.nfc_video_id_card_light);
    }

    private final int a(Context context, int i, int i2) {
        return a(context, i) ? i : i2;
    }

    private final boolean a(Context context, int i) throws IOException {
        AssetFileDescriptor assetFileDescriptorOpenRawResourceFd = context.getResources().openRawResourceFd(i);
        try {
            boolean z = assetFileDescriptorOpenRawResourceFd.getLength() > 0;
            assetFileDescriptorOpenRawResourceFd.close();
            return z;
        } finally {
        }
    }
}
