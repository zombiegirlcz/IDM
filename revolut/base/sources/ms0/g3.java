package ms0;

import android.content.Context;
import aw0.a9;
import com.revolut.core.ui_kit.internal.views.ProductIntroView;
import com.revolut.core.ui_kit_core.displayers.video.Video;
import com.revolut.core.ui_kit_core.displayers.video.models.UrlVideo;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.ArrayDeque;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class g3 implements h3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o2 f208260a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r2 f208261b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f208262c;
    public final ifm.b d;

    public g3(o2 model, r2 story, boolean z) {
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(story, "story");
        this.f208260a = model;
        this.f208261b = story;
        this.f208262c = z;
        this.d = new ifm.b();
    }

    @Override // ms0.h3
    public final void dispose() {
        this.d.dispose();
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g3)) {
            return false;
        }
        g3 g3Var = (g3) obj2;
        return Intrinsics.f(this.f208260a, g3Var.f208260a) && Intrinsics.f(this.f208261b, g3Var.f208261b) && this.f208262c == g3Var.f208262c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f208262c) + ((this.f208261b.hashCode() + (this.f208260a.hashCode() * 31)) * 31);
    }

    @Override // ms0.h3
    public final t2 n() {
        return this.f208260a;
    }

    @Override // ms0.h3
    public final h3 o() {
        r2 r2Var;
        o2 o2Var = this.f208260a;
        o2Var.getClass();
        List list = o2Var.f208351a;
        r2 story = this.f208261b;
        Intrinsics.checkNotNullParameter(story, "story");
        a9 a9Var = o2Var.f208352b;
        int[] iArr = n2.f208337a;
        int i = iArr[a9Var.ordinal()];
        if (i == 1) {
            Intrinsics.checkNotNullParameter(story, "story");
            if (list.indexOf(story) >= zhm.v.j(list)) {
                return new d3(o2Var, null);
            }
        } else if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        o2Var.getClass();
        List list2 = o2Var.f208351a;
        Intrinsics.checkNotNullParameter(story, "currentStory");
        Intrinsics.checkNotNullParameter(story, "story");
        int iIndexOf = list2.indexOf(story);
        boolean z = iIndexOf >= zhm.v.j(list2);
        int i2 = iArr[o2Var.f208352b.ordinal()];
        if (i2 == 1) {
            r2Var = (r2) list2.get(iIndexOf + 1);
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            r2Var = z ? (r2) list2.get(0) : (r2) list2.get(iIndexOf + 1);
        }
        return new g3(o2Var, r2Var, false);
    }

    @Override // ms0.h3
    public final h3 q(t2 model, u2 sharedState) {
        r2 story;
        Object obj2;
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(sharedState, "sharedState");
        boolean z = model instanceof o2;
        boolean z3 = false;
        boolean zContains = true;
        e3 e3Var = e3.f208238a;
        if (z) {
            o2 o2Var = (o2) model;
            List list = o2Var.f208351a;
            int size = list.size();
            int i = 0;
            while (true) {
                story = this.f208261b;
                if (i >= size) {
                    obj2 = null;
                    break;
                }
                obj2 = list.get(i);
                if (Intrinsics.f((r2) obj2, story)) {
                    break;
                }
                i++;
            }
            r2 r2Var = (r2) obj2;
            o2 o2Var2 = this.f208260a;
            o2Var2.getClass();
            Intrinsics.checkNotNullParameter(story, "story");
            int iIndexOf = o2Var2.f208351a.indexOf(story);
            boolean z4 = this.f208262c;
            if (iIndexOf == 0 && !z4) {
                return v4.a(o2Var, sharedState);
            }
            if (r2Var != null) {
                r2 r2Var2 = (r2) zhm.d0.d0(list);
                if (r2Var2 == null) {
                    return new d3(o2Var, new IllegalStateException("At least one story is expected for the product intro"));
                }
                Video video = r2Var2.f208395c;
                b3 b3Var = (b3) sharedState;
                b3Var.getClass();
                Intrinsics.checkNotNullParameter(video, "video");
                if (video instanceof UrlVideo) {
                    ArrayDeque arrayDeque = b3Var.d;
                    UrlVideo urlVideo = (UrlVideo) video;
                    Context context = b3Var.f208189a;
                    Intrinsics.checkNotNullParameter(context, "context");
                    zContains = arrayDeque.contains(kli.a.q(context) ? urlVideo.f60090b : urlVideo.f60089a);
                }
                return zContains ? new g3(o2Var, r2Var, z4) : new f3(o2Var);
            }
            b3 b3Var2 = (b3) sharedState;
            int i2 = a3.f208176a[((ProductIntroView) b3Var2.f208191c.f185144b).f.ordinal()];
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                z3 = true;
            }
            if (z3) {
                return e3Var.q(model, b3Var2);
            }
        } else {
            if (model instanceof p2) {
                return new c3(model, new RuntimeException("Model.Error received"));
            }
            b3 b3Var3 = (b3) sharedState;
            int i3 = a3.f208176a[((ProductIntroView) b3Var3.f208191c.f185144b).f.ordinal()];
            if (i3 != 1) {
                if (i3 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                z3 = true;
            }
            if (z3) {
                return e3Var.q(model, b3Var3);
            }
        }
        return this;
    }

    @Override // ms0.h3
    public final h3 r(Throwable error) {
        Intrinsics.checkNotNullParameter(error, "error");
        return new d3(this.f208260a, error);
    }
}
