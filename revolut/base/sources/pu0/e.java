package pu0;

import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import te0.w;

/* JADX INFO: loaded from: classes19.dex */
public final class e {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ShapeDrawable f239790a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f239791b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final rzl.c f239792c;
    public final d d;
    public final int e;
    public final float f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f239793g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Object f239794h;

    public e(ShapeDrawable barDrawable, float f) {
        rzl.c position = new rzl.c(0);
        d roundedSide = d.NONE;
        Intrinsics.checkNotNullParameter(barDrawable, "barDrawable");
        Intrinsics.checkNotNullParameter(position, "position");
        Intrinsics.checkNotNullParameter(roundedSide, "roundedSide");
        this.f239790a = barDrawable;
        this.f239791b = 255;
        this.f239792c = position;
        this.d = roundedSide;
        this.e = -16776961;
        this.f = f;
        final int i = 0;
        this.f239793g = w.y0(new Function0(this) { // from class: pu0.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f239789b;

            {
                this.f239789b = this;
            }

            /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                e eVar = this.f239789b;
                switch (i2) {
                    case 0:
                        float f4 = eVar.f;
                        return new float[]{f4, f4, f4, f4, f4, f4, f4, f4};
                    default:
                        return new RoundRectShape((float[]) eVar.f239793g.getValue(), null, null);
                }
            }
        });
        final int i2 = 1;
        this.f239794h = w.y0(new Function0(this) { // from class: pu0.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f239789b;

            {
                this.f239789b = this;
            }

            /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                e eVar = this.f239789b;
                switch (i22) {
                    case 0:
                        float f4 = eVar.f;
                        return new float[]{f4, f4, f4, f4, f4, f4, f4, f4};
                    default:
                        return new RoundRectShape((float[]) eVar.f239793g.getValue(), null, null);
                }
            }
        });
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f239790a, eVar.f239790a) && this.f239791b == eVar.f239791b && Intrinsics.f(this.f239792c, eVar.f239792c) && Float.compare(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == 0 && Float.compare(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == 0 && this.d == eVar.d && this.e == eVar.e && Float.compare(this.f, eVar.f) == 0;
    }

    public final int hashCode() {
        return m72.b.b(this.f, j6.a.b(this.e, (this.d.hashCode() + m72.b.b(BitmapDescriptorFactory.HUE_RED, m72.b.b(BitmapDescriptorFactory.HUE_RED, (this.f239792c.hashCode() + j6.a.b(this.f239791b, this.f239790a.hashCode() * 31, 31)) * 31, 31), 31)) * 31, 31), 31);
    }
}
