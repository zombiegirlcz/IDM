package gkl;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class q0 {

    @NotNull
    public static final p0 Companion = new p0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f144483a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k0 f144484b;

    public q0(ArrayList documents, k0 config) {
        Intrinsics.checkNotNullParameter(documents, "documents");
        Intrinsics.checkNotNullParameter(config, "config");
        this.f144483a = documents;
        this.f144484b = config;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q0)) {
            return false;
        }
        q0 q0Var = (q0) obj2;
        return this.f144483a.equals(q0Var.f144483a) && this.f144484b.equals(q0Var.f144484b);
    }

    public final int hashCode() {
        return this.f144484b.hashCode() + (this.f144483a.hashCode() * 31);
    }
}
