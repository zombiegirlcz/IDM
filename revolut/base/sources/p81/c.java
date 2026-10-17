package p81;

import kotlin.jvm.internal.Intrinsics;
import mlm.g;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes.dex */
@g
public final class c {

    @NotNull
    public static final b Companion = new b(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f233818a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f233819b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f233820c;

    public /* synthetic */ c(int i, String str, String str2, String str3) {
        if (7 != (i & 7)) {
            j1.f(a.f233817a.getDescriptor(), i, 7);
            throw null;
        }
        this.f233818a = str;
        this.f233819b = str2;
        this.f233820c = str3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f233818a, cVar.f233818a) && Intrinsics.f(this.f233819b, cVar.f233819b) && Intrinsics.f(this.f233820c, cVar.f233820c);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f233818a.hashCode() * 31, 31, this.f233819b);
        String str = this.f233820c;
        return iC + (str == null ? 0 : str.hashCode());
    }
}
