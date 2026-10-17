package com.fourthline.core;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/fourthline/core/Gender;", "", "<init>", "(Ljava/lang/String;I)V", "UNKNOWN", "MALE", "FEMALE", "fourthline-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class Gender {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final /* synthetic */ Gender[] f26253a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f26254b;
    public static final Gender UNKNOWN = new Gender("UNKNOWN", 0);
    public static final Gender MALE = new Gender("MALE", 1);
    public static final Gender FEMALE = new Gender("FEMALE", 2);

    static {
        Gender[] genderArrA = a();
        f26253a = genderArrA;
        f26254b = s.n(genderArrA);
    }

    private Gender(String str, int i) {
    }

    private static final /* synthetic */ Gender[] a() {
        return new Gender[]{UNKNOWN, MALE, FEMALE};
    }

    @NotNull
    public static EnumEntries getEntries() {
        return f26254b;
    }

    public static Gender valueOf(String str) {
        return (Gender) Enum.valueOf(Gender.class, str);
    }

    public static Gender[] values() {
        return (Gender[]) f26253a.clone();
    }
}
