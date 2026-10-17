package hoi;

import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qv0.c;

/* JADX INFO: loaded from: classes10.dex */
public abstract class n {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c.f f154333a = new c.f((qv0.h) null, 3);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final c.e f154334b = new c.e((qv0.h) null, 3);

    public static final class a extends n {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f154335c = new a();
        public static final c.f d;
        public static final c.e e;

        static {
            n.Companion.getClass();
            d = n.f154333a;
            e = n.f154334b;
        }

        private a() {
        }

        @Override // hoi.n
        public final void a(RecyclerView.ViewHolder viewHolder, p animator) {
            Intrinsics.checkNotNullParameter(animator, "animator");
            Intrinsics.checkNotNullParameter(viewHolder, "holder");
            s sVar = (s) animator.f154337a;
            sVar.getClass();
            Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
            sVar.dispatchRemoveFinished(viewHolder);
        }

        @Override // hoi.n
        public final boolean b() {
            return true;
        }

        @Override // hoi.n
        public final float c() {
            return BitmapDescriptorFactory.HUE_RED;
        }

        @Override // hoi.n
        public final qv0.c d() {
            return e;
        }

        @Override // hoi.n
        public final qv0.c e() {
            return d;
        }

        @Override // hoi.n
        public final float f() {
            return 1.0f;
        }
    }

    public static final class b {
        private b() {
        }
    }

    public static final class c extends n {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final c f154336c = new c();
        public static final c.e d;
        public static final c.f e;

        static {
            n.Companion.getClass();
            d = n.f154334b;
            e = n.f154333a;
        }

        private c() {
        }

        @Override // hoi.n
        public final void a(RecyclerView.ViewHolder viewHolder, p animator) {
            Intrinsics.checkNotNullParameter(animator, "animator");
            Intrinsics.checkNotNullParameter(viewHolder, "holder");
            s sVar = (s) animator.f154337a;
            sVar.getClass();
            Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
            sVar.dispatchAddFinished(viewHolder);
        }

        @Override // hoi.n
        public final boolean b() {
            return false;
        }

        @Override // hoi.n
        public final float c() {
            return 1.0f;
        }

        @Override // hoi.n
        public final qv0.c d() {
            return e;
        }

        @Override // hoi.n
        public final qv0.c e() {
            return d;
        }

        @Override // hoi.n
        public final float f() {
            return BitmapDescriptorFactory.HUE_RED;
        }
    }

    private n() {
    }

    public abstract void a(RecyclerView.ViewHolder viewHolder, p pVar);

    public abstract boolean b();

    public abstract float c();

    public abstract qv0.c d();

    public abstract qv0.c e();

    public abstract float f();
}
