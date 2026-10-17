package gkl;

import java.time.ZonedDateTime;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class f0 implements h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jkl.i f144445a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ZonedDateTime f144446b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set f144447c;

    public f0(jkl.i iVar, ZonedDateTime zonedDateTime, Set actions) {
        Intrinsics.checkNotNullParameter(actions, "actions");
        this.f144445a = iVar;
        this.f144446b = zonedDateTime;
        this.f144447c = actions;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f0)) {
            return false;
        }
        f0 f0Var = (f0) obj2;
        return this.f144445a == f0Var.f144445a && Intrinsics.f(this.f144446b, f0Var.f144446b) && Intrinsics.f(this.f144447c, f0Var.f144447c);
    }

    public final int hashCode() {
        jkl.i iVar = this.f144445a;
        int iHashCode = (iVar == null ? 0 : iVar.hashCode()) * 31;
        ZonedDateTime zonedDateTime = this.f144446b;
        return this.f144447c.hashCode() + ((iHashCode + (zonedDateTime != null ? zonedDateTime.hashCode() : 0)) * 31);
    }
}
