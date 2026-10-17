package wxd;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f300862a;

    public h(ArrayList paragraphs) {
        Intrinsics.checkNotNullParameter(paragraphs, "paragraphs");
        this.f300862a = paragraphs;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && this.f300862a.equals(((h) obj2).f300862a);
    }

    public final int hashCode() {
        return this.f300862a.hashCode();
    }
}
