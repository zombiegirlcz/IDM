package lem;

import com.google.android.material.internal.ViewUtils;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes23.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ArrayList f194598a;

    public final int a(int i) {
        return ((int[]) this.f194598a.get(i / ViewUtils.EDGE_TO_EDGE_FLAGS))[i % ViewUtils.EDGE_TO_EDGE_FLAGS];
    }

    public final void b(int i, int i2) {
        ((int[]) this.f194598a.get(i / ViewUtils.EDGE_TO_EDGE_FLAGS))[i % ViewUtils.EDGE_TO_EDGE_FLAGS] = i2;
    }
}
