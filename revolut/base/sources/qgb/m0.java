package qgb;

import com.youTransactor.uCube.rpc.Constants;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes6.dex */
@mlm.g
public final class m0 {

    @NotNull
    public static final n Companion = new n();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Lazy[] f245755j = {null, null, null, null, yhm.j.c(yhm.k.PUBLICATION, new qba.c(22)), null, null, null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f245756a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f245757b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Instant f245758c;
    public final w d;
    public final List e;
    public final i0 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final c0 f245759g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final l0 f245760h;
    public final boolean i;

    public /* synthetic */ m0(int i, String str, boolean z, Instant instant, w wVar, List list, i0 i0Var, c0 c0Var, l0 l0Var, boolean z3) {
        if (219 != (i & Constants.TAG_KSL_ID)) {
            j1.f(j.f245747a.getDescriptor(), i, Constants.TAG_KSL_ID);
            throw null;
        }
        this.f245756a = str;
        this.f245757b = z;
        if ((i & 4) == 0) {
            this.f245758c = null;
        } else {
            this.f245758c = instant;
        }
        this.d = wVar;
        this.e = list;
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = i0Var;
        }
        this.f245759g = c0Var;
        this.f245760h = l0Var;
        if ((i & 256) == 0) {
            this.i = false;
        } else {
            this.i = z3;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m0)) {
            return false;
        }
        m0 m0Var = (m0) obj2;
        return Intrinsics.f(this.f245756a, m0Var.f245756a) && this.f245757b == m0Var.f245757b && Intrinsics.f(this.f245758c, m0Var.f245758c) && Intrinsics.f(this.d, m0Var.d) && Intrinsics.f(this.e, m0Var.e) && Intrinsics.f(this.f, m0Var.f) && Intrinsics.f(this.f245759g, m0Var.f245759g) && Intrinsics.f(this.f245760h, m0Var.f245760h) && this.i == m0Var.i;
    }

    public final int hashCode() {
        int iC = j6.a.c(this.f245756a.hashCode() * 31, 31, this.f245757b);
        Instant instant = this.f245758c;
        int iD = p.a.d((this.d.hashCode() + ((iC + (instant == null ? 0 : instant.hashCode())) * 31)) * 31, 31, this.e);
        i0 i0Var = this.f;
        return Boolean.hashCode(this.i) + ((this.f245760h.hashCode() + ((this.f245759g.hashCode() + ((iD + (i0Var != null ? i0Var.hashCode() : 0)) * 31)) * 31)) * 31);
    }

    public m0(String status, boolean z, Instant instant, w header, ArrayList rewards, i0 i0Var, c0 optIn, l0 termsAndConditions, boolean z3) {
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(rewards, "rewards");
        Intrinsics.checkNotNullParameter(optIn, "optIn");
        Intrinsics.checkNotNullParameter(termsAndConditions, "termsAndConditions");
        this.f245756a = status;
        this.f245757b = z;
        this.f245758c = instant;
        this.d = header;
        this.e = rewards;
        this.f = i0Var;
        this.f245759g = optIn;
        this.f245760h = termsAndConditions;
        this.i = z3;
    }
}
