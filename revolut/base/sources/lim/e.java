package lim;

import java.io.File;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes14.dex */
public final class e extends i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f195564b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(File rootFile) {
        super(rootFile);
        Intrinsics.checkNotNullParameter(rootFile, "rootFile");
    }

    @Override // lim.i
    public final File a() {
        if (this.f195564b) {
            return null;
        }
        this.f195564b = true;
        return this.f195569a;
    }
}
