package com.fourthline.orca.internal;

import com.fourthline.orca.internal.er;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public abstract class vf {
    public static final String a(er erVar) {
        Intrinsics.checkNotNullParameter(erVar, "<this>");
        if (Intrinsics.f(erVar, er.a.f28230a)) {
            return "document_expired";
        }
        if (Intrinsics.f(erVar, er.e.f28238a)) {
            return "document_type_not_supported";
        }
        if (Intrinsics.f(erVar, er.c.f28234a)) {
            return "document_not_detected";
        }
        if (Intrinsics.f(erVar, er.d.f28236a)) {
            return "document_type_not_matching";
        }
        if (Intrinsics.f(erVar, er.g.f28242a)) {
            return "issuing_country_not_supported";
        }
        if (Intrinsics.f(erVar, er.f.f28240a)) {
            return "issuing_country_not_matching";
        }
        if (Intrinsics.f(erVar, er.i.f28246a)) {
            return "nationality_not_supported";
        }
        if (Intrinsics.f(erVar, er.j.f28248a)) {
            return "person_underage";
        }
        if (Intrinsics.f(erVar, er.b.f28232a)) {
            return "document_side_not_matching";
        }
        if (Intrinsics.f(erVar, er.h.f28244a)) {
            return "document_type_not_detected";
        }
        throw new NoWhenBranchMatchedException();
    }
}
