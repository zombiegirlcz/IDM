package com.onfido.api.client.token.sdk;

import cl.a;
import com.onfido.api.client.e;
import com.onfido.api.client.token.InternalToken;
import com.onfido.api.client.token.sdk.model.InternalSDKTokenPayload;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import rlm.o;

/* JADX INFO: loaded from: classes17.dex */
public final class InternalSDKToken extends InternalToken {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dl.a f50155a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public InternalSDKTokenPayload f50156b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InternalSDKToken(String tokenValue, String str, dl.a urlCreator) {
        super(tokenValue, null);
        Intrinsics.checkNotNullParameter(tokenValue, "tokenValue");
        Intrinsics.checkNotNullParameter(urlCreator, "urlCreator");
        o oVar = e.f50133a;
        setAppId(str);
        this.f50155a = urlCreator;
    }

    public final synchronized InternalSDKTokenPayload a() {
        try {
            if (this.f50156b == null) {
                this.f50156b = InternalSDKTokenPayload.INSTANCE.parseSDKTokenPayload(getTokenValue());
            }
        } catch (Throwable th10) {
            throw th10;
        }
        return this.f50156b;
    }

    public final ApplicantId b() {
        String applicantUuid;
        if (isDemoToken()) {
            return new ApplicantId(getTokenValue());
        }
        InternalSDKTokenPayload internalSDKTokenPayloadA = a();
        if (internalSDKTokenPayloadA == null || (applicantUuid = internalSDKTokenPayloadA.getApplicantUuid()) == null) {
            applicantUuid = "";
        }
        return new ApplicantId(applicantUuid);
    }
}
