package com.fourthline.core.location.internal;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/fourthline/core/location/internal/Request;", "", "<init>", "(Ljava/lang/String;I)V", "AUTHORIZATION", "FULL_ACCURACY", "LOCATION_UPDATES", "fourthline-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class Request {
    public static final Request AUTHORIZATION = new Request("AUTHORIZATION", 0);
    public static final Request FULL_ACCURACY = new Request("FULL_ACCURACY", 1);
    public static final Request LOCATION_UPDATES = new Request("LOCATION_UPDATES", 2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final /* synthetic */ Request[] f26437a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f26438b;

    static {
        Request[] requestArrA = a();
        f26437a = requestArrA;
        f26438b = s.n(requestArrA);
    }

    private Request(String str, int i) {
    }

    private static final /* synthetic */ Request[] a() {
        return new Request[]{AUTHORIZATION, FULL_ACCURACY, LOCATION_UPDATES};
    }

    @NotNull
    public static EnumEntries getEntries() {
        return f26438b;
    }

    public static Request valueOf(String str) {
        return (Request) Enum.valueOf(Request.class, str);
    }

    public static Request[] values() {
        return (Request[]) f26437a.clone();
    }
}
