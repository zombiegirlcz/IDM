package mx0;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final class pb extends View {

    @NotNull
    private static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f209937a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Path f209938b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Path f209939c;
    public final Path d;
    public final float e;
    public final mr0.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final lr0.e f209940g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f209941h;
    public final float i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final float f209942j;

    public static final class a {
        private a() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public pb(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static void a(Path path, float f, float f4, float f5, float f6) {
        path.rewind();
        path.addCircle(f, f4, f5 + f6, Path.Direction.CW);
        float f32 = f5 - f6;
        if (f32 > BitmapDescriptorFactory.HUE_RED) {
            path.addCircle(f, f4, f32, Path.Direction.CCW);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        float f = this.f209937a;
        if (f <= BitmapDescriptorFactory.HUE_RED) {
            return;
        }
        this.f209940g.d(canvas, this.f, f, null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public pb(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pb(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        Path path = new Path();
        this.f209938b = path;
        Path path2 = new Path();
        this.f209939c = path2;
        Path path3 = new Path();
        this.d = path3;
        this.e = kli.a.l(context, 1.0f) / 2.0f;
        mr0.e eVar = new mr0.e(path, path2, path3);
        this.f = eVar;
        lr0.e eVarA = lr0.f.a(context, eVar, i2b.a.s(context));
        this.f209940g = eVarA;
        this.f209941h = eVarA.b();
        this.i = eVarA.a() / 2.0f;
        this.f209942j = eVarA.c() / 2.0f;
        setImportantForAccessibility(2);
    }

    public /* synthetic */ pb(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
