package lim;

import java.io.File;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public abstract class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final File f195569a;

    public i(File root) {
        Intrinsics.checkNotNullParameter(root, "root");
        this.f195569a = root;
    }

    public abstract File a();
}
