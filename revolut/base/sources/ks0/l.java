package ks0;

import android.view.View;
import androidx.collection.ArrayMap;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class l {

    @NotNull
    public static final j Companion = new j();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f189079a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayMap f189080b = new ArrayMap();

    public l(View view) {
        this.f189079a = view;
    }

    public static void d(l lVar, Object token, Float f, Float f4, Float f5, int i) {
        if ((i & 4) != 0) {
            f = null;
        }
        if ((i & 8) != 0) {
            f4 = null;
        }
        if ((i & 16) != 0) {
            f5 = null;
        }
        lVar.getClass();
        Intrinsics.checkNotNullParameter(token, "token");
        ArrayMap arrayMap = lVar.f189080b;
        k kVar = (k) arrayMap.get(token);
        if (kVar == null) {
            kVar = new k();
            arrayMap.put(token, kVar);
        }
        kVar.f189076a = f;
        kVar.f189077b = f4;
        kVar.f189078c = f5;
        lVar.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a() {
        ArrayMap arrayMap = this.f189080b;
        int size = arrayMap.getSize();
        float fFloatValue = 1.0f;
        float fFloatValue2 = 0.0f;
        float fFloatValue3 = 1.0f;
        for (int i = 0; i < size; i++) {
            k kVar = (k) arrayMap.valueAt(i);
            kVar.getClass();
            Float f = kVar.f189076a;
            if (f != null) {
                fFloatValue2 += f.floatValue();
            }
            Float f4 = kVar.f189077b;
            if (f4 != null) {
                fFloatValue = f4.floatValue() * fFloatValue;
            }
            Float f5 = kVar.f189078c;
            if (f5 != null) {
                fFloatValue3 = f5.floatValue() * fFloatValue3;
            }
        }
        View view = this.f189079a;
        view.setTranslationX(BitmapDescriptorFactory.HUE_RED);
        view.setTranslationY(fFloatValue2);
        view.setScaleX(fFloatValue);
        view.setScaleY(fFloatValue3);
    }

    public final Float b(Object token) {
        Intrinsics.checkNotNullParameter(token, "token");
        k kVar = (k) this.f189080b.get(token);
        if (kVar != null) {
            return kVar.f189077b;
        }
        return null;
    }

    public final Float c(Object token) {
        Intrinsics.checkNotNullParameter(token, "token");
        k kVar = (k) this.f189080b.get(token);
        if (kVar != null) {
            return kVar.f189076a;
        }
        return null;
    }
}
