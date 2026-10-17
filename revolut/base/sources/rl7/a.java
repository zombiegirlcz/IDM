package rl7;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import s7a.c0;

/* JADX INFO: loaded from: classes4.dex */
public final class a implements c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f254920a;

    public a(ArrayList answers) {
        Intrinsics.checkNotNullParameter(answers, "answers");
        this.f254920a = answers;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && this.f254920a.equals(((a) obj2).f254920a);
    }

    public final int hashCode() {
        return this.f254920a.hashCode();
    }
}
