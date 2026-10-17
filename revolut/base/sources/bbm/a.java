package bbm;

import abm.h;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import io.fotoapparat.exception.UnableToDecodeBitmapException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import uam.i;

/* JADX INFO: loaded from: classes21.dex */
public final class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14351a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Function1 f14352b;

    public a(int i, Function1 sizeTransformer) {
        this.f14351a = i;
        switch (i) {
            case 1:
                this.f14352b = sizeTransformer;
                break;
            default:
                Intrinsics.checkNotNullParameter(sizeTransformer, "sizeTransformer");
                this.f14352b = sizeTransformer;
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f14351a) {
            case 0:
                h input = (h) obj2;
                Intrinsics.checkNotNullParameter(input, "input");
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                byte[] bArr = input.f2997a;
                BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
                int i = options.outWidth;
                int i2 = options.outHeight;
                i iVar = (i) this.f14352b.invoke(new i(i, i2));
                int i3 = iVar.f278699b;
                float fMin = Math.min(i / iVar.f278698a, i2 / i3);
                BitmapFactory.Options options2 = new BitmapFactory.Options();
                int i5 = (int) fMin;
                options2.inSampleSize = i5;
                options2.inScaled = true;
                int i6 = iVar.f278698a;
                if (i6 > i3) {
                    options2.inDensity = i;
                    options2.inTargetDensity = i5 * i6;
                } else {
                    options2.inDensity = i2;
                    options2.inTargetDensity = i5 * i3;
                }
                byte[] bArr2 = input.f2997a;
                Bitmap bitmap = BitmapFactory.decodeByteArray(bArr2, 0, bArr2.length, options2);
                if (bitmap == null) {
                    throw new UnableToDecodeBitmapException();
                }
                if (bitmap.getWidth() != i6 || bitmap.getHeight() != i3) {
                    bitmap = Bitmap.createScaledBitmap(bitmap, i6, i3, true);
                }
                Intrinsics.checkNotNullExpressionValue(bitmap, "bitmap");
                return new abm.a(bitmap, input.f2998b);
            default:
                KotlinType kotlinType = (KotlinType) obj2;
                Intrinsics.h(kotlinType);
                return this.f14352b.invoke(kotlinType).toString();
        }
    }
}
