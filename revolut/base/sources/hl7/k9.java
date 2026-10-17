package hl7;

import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class k9 {

    @NotNull
    public static final j9 Companion = new j9();
    public static final Lazy[] d = {null, yhm.j.c(yhm.k.PUBLICATION, new q0(24)), null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f153175a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f153176b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f153177c;

    public /* synthetic */ k9(int i, Integer num, String str, List list) {
        if (7 != (i & 7)) {
            qlm.j1.f(i9.f153151a.getDescriptor(), i, 7);
            throw null;
        }
        this.f153175a = num;
        this.f153176b = list;
        this.f153177c = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k9)) {
            return false;
        }
        k9 k9Var = (k9) obj2;
        return Intrinsics.f(this.f153175a, k9Var.f153175a) && Intrinsics.f(this.f153176b, k9Var.f153176b) && Intrinsics.f(this.f153177c, k9Var.f153177c);
    }

    public final int hashCode() {
        Integer num = this.f153175a;
        return this.f153177c.hashCode() + p.a.d((num == null ? 0 : num.hashCode()) * 31, 31, this.f153176b);
    }

    public k9(Integer num, ArrayList documents, String batchState) {
        Intrinsics.checkNotNullParameter(documents, "documents");
        Intrinsics.checkNotNullParameter(batchState, "batchState");
        this.f153175a = num;
        this.f153176b = documents;
        this.f153177c = batchState;
    }
}
