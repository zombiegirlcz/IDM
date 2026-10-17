package jh;

import android.graphics.Bitmap;
import android.media.Image;
import com.google.android.gms.common.internal.GmsLogger;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.mlkit.common.MlKitException;
import com.google.mlkit.vision.common.InputImage;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f174101a;

    static {
        new GmsLogger("MLKitImageUtils", "");
        f174101a = new b();
    }

    public static IObjectWrapper a(InputImage inputImage) throws MlKitException {
        int iH = inputImage.h();
        if (iH == -1) {
            return ObjectWrapper.wrap((Bitmap) Preconditions.checkNotNull(inputImage.e()));
        }
        if (iH != 17) {
            if (iH == 35) {
                return ObjectWrapper.wrap(inputImage.j());
            }
            if (iH != 842094169) {
                throw new MlKitException(a0.d.n("Unsupported image format: ", inputImage.h()), 3);
            }
        }
        return ObjectWrapper.wrap((ByteBuffer) Preconditions.checkNotNull(inputImage.f()));
    }

    public static int b(InputImage inputImage) {
        if (inputImage.h() == -1) {
            return ((Bitmap) Preconditions.checkNotNull(inputImage.e())).getAllocationByteCount();
        }
        if (inputImage.h() == 17 || inputImage.h() == 842094169) {
            return ((ByteBuffer) Preconditions.checkNotNull(inputImage.f())).limit();
        }
        if (inputImage.h() != 35) {
            return 0;
        }
        return (((Image.Plane[]) Preconditions.checkNotNull(inputImage.k()))[0].getBuffer().limit() * 3) / 2;
    }
}
