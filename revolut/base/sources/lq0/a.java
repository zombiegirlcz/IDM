package lq0;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class a implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f199163a;

    public a(ArrayList delegates) {
        Intrinsics.checkNotNullParameter(delegates, "delegates");
        this.f199163a = delegates;
    }

    @Override // lq0.b
    public final void a(float f) {
        ArrayList arrayList = this.f199163a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((b) arrayList.get(i)).a(f);
        }
    }

    @Override // lq0.b
    public final void b(dcl.q sideEffectHelper) {
        Intrinsics.checkNotNullParameter(sideEffectHelper, "sideEffectHelper");
        ArrayList arrayList = this.f199163a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((b) arrayList.get(i)).b(sideEffectHelper);
        }
    }

    @Override // lq0.b
    public final void c(dcl.q sideEffectHelper) {
        Intrinsics.checkNotNullParameter(sideEffectHelper, "sideEffectHelper");
        ArrayList arrayList = this.f199163a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((b) arrayList.get(i)).c(sideEffectHelper);
        }
    }
}
