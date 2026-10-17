package com.trustdockekyc.core.backend.internal.infrastructure.api.entity.transactionapi.process.jpkict;

import ch.qos.logback.core.CoreConstants;
import k1m.i;
import k1m.m;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kp0.w0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@m(generateAdapter = true)
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0081\b\u0018\u00002\u00020\u0001B;\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0002\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tJD\u0010\n\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0004\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00022\b\b\u0003\u0010\u0006\u001a\u00020\u00022\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/process/jpkict/JPKICTIdentificationResultBasicPersonalInformation;", "", "", "name", "birth", "gender", "address", "individualNumber", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/process/jpkict/JPKICTIdentificationResultBasicPersonalInformation;", "backend_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class JPKICTIdentificationResultBasicPersonalInformation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f107517a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f107518b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f107519c;
    public final String d;
    public final String e;

    public JPKICTIdentificationResultBasicPersonalInformation(@i(name = "name") @NotNull String name, @i(name = "birth") @NotNull String birth, @i(name = "gender") @NotNull String gender, @i(name = "address") @NotNull String address, @i(name = "individual_number") String str) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(birth, "birth");
        Intrinsics.checkNotNullParameter(gender, "gender");
        Intrinsics.checkNotNullParameter(address, "address");
        this.f107517a = name;
        this.f107518b = birth;
        this.f107519c = gender;
        this.d = address;
        this.e = str;
    }

    @NotNull
    public final JPKICTIdentificationResultBasicPersonalInformation copy(@i(name = "name") @NotNull String name, @i(name = "birth") @NotNull String birth, @i(name = "gender") @NotNull String gender, @i(name = "address") @NotNull String address, @i(name = "individual_number") String individualNumber) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(birth, "birth");
        Intrinsics.checkNotNullParameter(gender, "gender");
        Intrinsics.checkNotNullParameter(address, "address");
        return new JPKICTIdentificationResultBasicPersonalInformation(name, birth, gender, address, individualNumber);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof JPKICTIdentificationResultBasicPersonalInformation)) {
            return false;
        }
        JPKICTIdentificationResultBasicPersonalInformation jPKICTIdentificationResultBasicPersonalInformation = (JPKICTIdentificationResultBasicPersonalInformation) obj2;
        return Intrinsics.f(this.f107517a, jPKICTIdentificationResultBasicPersonalInformation.f107517a) && Intrinsics.f(this.f107518b, jPKICTIdentificationResultBasicPersonalInformation.f107518b) && Intrinsics.f(this.f107519c, jPKICTIdentificationResultBasicPersonalInformation.f107519c) && Intrinsics.f(this.d, jPKICTIdentificationResultBasicPersonalInformation.d) && Intrinsics.f(this.e, jPKICTIdentificationResultBasicPersonalInformation.e);
    }

    public final int hashCode() {
        int iA = w0.a(this.d, w0.a(this.f107519c, w0.a(this.f107518b, this.f107517a.hashCode() * 31)));
        String str = this.e;
        return iA + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb6 = new StringBuilder("JPKICTIdentificationResultBasicPersonalInformation(name=");
        sb6.append(this.f107517a);
        sb6.append(", birth=");
        sb6.append(this.f107518b);
        sb6.append(", gender=");
        sb6.append(this.f107519c);
        sb6.append(", address=");
        sb6.append(this.d);
        sb6.append(", individualNumber=");
        return j6.a.u(sb6, this.e, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }

    public /* synthetic */ JPKICTIdentificationResultBasicPersonalInformation(String str, String str2, String str3, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, (i & 16) != 0 ? null : str5);
    }
}
