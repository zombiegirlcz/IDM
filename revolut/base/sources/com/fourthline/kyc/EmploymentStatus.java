package com.fourthline.kyc;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import vc.s;
import yhm.d;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/fourthline/kyc/EmploymentStatus;", "", "<init>", "(Ljava/lang/String;I)V", "EMPLOYED", "SELF_EMPLOYED", "UNEMPLOYED", "fourthline-kyc_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@d
public final class EmploymentStatus {
    public static final EmploymentStatus EMPLOYED = new EmploymentStatus("EMPLOYED", 0);
    public static final EmploymentStatus SELF_EMPLOYED = new EmploymentStatus("SELF_EMPLOYED", 1);
    public static final EmploymentStatus UNEMPLOYED = new EmploymentStatus("UNEMPLOYED", 2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final /* synthetic */ EmploymentStatus[] f26504a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f26505b;

    static {
        EmploymentStatus[] employmentStatusArrA = a();
        f26504a = employmentStatusArrA;
        f26505b = s.n(employmentStatusArrA);
    }

    private EmploymentStatus(String str, int i) {
    }

    private static final /* synthetic */ EmploymentStatus[] a() {
        return new EmploymentStatus[]{EMPLOYED, SELF_EMPLOYED, UNEMPLOYED};
    }

    @NotNull
    public static EnumEntries getEntries() {
        return f26505b;
    }

    public static EmploymentStatus valueOf(String str) {
        return (EmploymentStatus) Enum.valueOf(EmploymentStatus.class, str);
    }

    public static EmploymentStatus[] values() {
        return (EmploymentStatus[]) f26504a.clone();
    }
}
