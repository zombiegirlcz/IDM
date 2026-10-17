package com.trustdockekyc.core.backend.internal.infrastructure.api.entity.transactionapi;

import ch.qos.logback.core.CoreConstants;
import k1m.i;
import k1m.m;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kp0.w0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@m(generateAdapter = true)
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0081\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ.\u0010\t\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0004\u001a\u00020\u00022\b\b\u0003\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/GetSettingResponse;", "", "", "backgroundColor", "textColor", "", "development", "<init>", "(Ljava/lang/String;Ljava/lang/String;Z)V", "copy", "(Ljava/lang/String;Ljava/lang/String;Z)Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/GetSettingResponse;", "backend_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class GetSettingResponse {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f107385a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f107386b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f107387c;

    public GetSettingResponse(@i(name = "background_color") @NotNull String backgroundColor, @i(name = "text_color") @NotNull String textColor, @i(name = "development") boolean z) {
        Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
        Intrinsics.checkNotNullParameter(textColor, "textColor");
        this.f107385a = backgroundColor;
        this.f107386b = textColor;
        this.f107387c = z;
    }

    @NotNull
    public final GetSettingResponse copy(@i(name = "background_color") @NotNull String backgroundColor, @i(name = "text_color") @NotNull String textColor, @i(name = "development") boolean development) {
        Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
        Intrinsics.checkNotNullParameter(textColor, "textColor");
        return new GetSettingResponse(backgroundColor, textColor, development);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof GetSettingResponse)) {
            return false;
        }
        GetSettingResponse getSettingResponse = (GetSettingResponse) obj2;
        return Intrinsics.f(this.f107385a, getSettingResponse.f107385a) && Intrinsics.f(this.f107386b, getSettingResponse.f107386b) && this.f107387c == getSettingResponse.f107387c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f107387c) + w0.a(this.f107386b, this.f107385a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb6 = new StringBuilder("GetSettingResponse(backgroundColor=");
        sb6.append(this.f107385a);
        sb6.append(", textColor=");
        sb6.append(this.f107386b);
        sb6.append(", development=");
        return j6.a.x(sb6, this.f107387c, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }
}
