package lq0;

import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashMap;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class p {

    @NotNull
    public static final o Companion = new o();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ViewGroup f199175a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f199176b;
    public float f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f199178g;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f199177c = new HashMap();
    public final HashMap d = new HashMap();
    public final ArrayList e = new ArrayList();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final dcl.q f199179h = new dcl.q(this);

    public p(ViewGroup viewGroup, m mVar) {
        this.f199175a = viewGroup;
        this.f199176b = mVar;
    }

    public final void a() {
        int i = this.f199178g;
        if (i == 2) {
            return;
        }
        if (i == 1) {
            b(1.0f);
            ArrayList arrayList = this.e;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                ((b) arrayList.get(i2)).b(this.f199179h);
            }
            this.f199176b.i(this.f199175a);
        }
        this.f199178g = 2;
    }

    public final void b(float f) {
        if (this.f199178g == 2) {
            return;
        }
        this.f = f;
        ArrayList arrayList = this.e;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((b) arrayList.get(i)).a(f);
        }
    }
}
