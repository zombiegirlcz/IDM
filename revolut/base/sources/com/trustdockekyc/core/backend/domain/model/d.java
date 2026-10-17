package com.trustdockekyc.core.backend.domain.model;

import ch.qos.logback.core.CoreConstants;
import java.io.Serializable;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import w1m.i;

/* JADX INFO: loaded from: classes12.dex */
public final class d implements Serializable {

    @NotNull
    public static final i Companion = new i();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f107375a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f107376b;

    public d(String packageId, ArrayList processes) {
        Intrinsics.checkNotNullParameter(packageId, "packageId");
        Intrinsics.checkNotNullParameter(processes, "processes");
        this.f107375a = packageId;
        this.f107376b = processes;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f107375a, dVar.f107375a) && this.f107376b.equals(dVar.f107376b);
    }

    public final int hashCode() {
        return this.f107376b.hashCode() + (this.f107375a.hashCode() * 31);
    }

    public final String toString() {
        return "SelectedPackage(packageId=" + this.f107375a + ", processes=" + this.f107376b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
