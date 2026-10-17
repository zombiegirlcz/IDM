package com.onfido.android.sdk.capture.internal.analytics.inhouse;

import com.onfido.android.sdk.capture.internal.analytics.inhouse.SdkTokenPayload;
import com.onfido.android.sdk.capture.internal.analytics.inhouse.domain.ApplicantInfo;
import java.util.List;
import jh.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import kotlin.text.d0;
import kotlinx.serialization.json.Json;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/SdkTokenParser;", "", "jsonParser", "Lkotlinx/serialization/json/Json;", "(Lkotlinx/serialization/json/Json;)V", "getApplicantInfo", "Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/domain/ApplicantInfo;", "sdkToken", "", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class SdkTokenParser {

    @NotNull
    private final Json jsonParser;

    public SdkTokenParser(@NotNull Json jsonParser) {
        Intrinsics.checkNotNullParameter(jsonParser, "jsonParser");
        this.jsonParser = jsonParser;
    }

    public final ApplicantInfo getApplicantInfo(@NotNull String sdkToken) {
        Intrinsics.checkNotNullParameter(sdkToken, "sdkToken");
        List listN0 = d0.n0(sdkToken, new String[]{"."}, 0, 6);
        if (listN0.size() == 1) {
            return null;
        }
        String strB = yk.a.b((String) listN0.get(1));
        Json json = this.jsonParser;
        SdkTokenPayload.OnfidoTokenPayload payload = ((SdkTokenPayload) json.b(d.v(json.f187949b, o0.b(SdkTokenPayload.class)), strB)).getPayload();
        return new ApplicantInfo(payload.getApplicantUuid(), payload.getClientUuid());
    }
}
