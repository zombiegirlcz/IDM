package com.onfido.hosted.web.module.model;

import ch.qos.logback.core.CoreConstants;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.u;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import mlm.g;
import org.jetbrains.annotations.NotNull;
import qlm.h;
import qlm.j1;
import vc.s;
import yhm.d;
import yhm.j;
import yhm.k;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0081\b\u0018\u0000 +2\u00020\u0001:\u0003*+,B=\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010\fB!\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\rJ\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0010\u0010\u001b\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u0011J0\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0002\u0010\u001dJ\u0013\u0010\u001e\u001a\u00020\t2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020\u0003HÖ\u0001J\t\u0010!\u001a\u00020\u0005HÖ\u0001J&\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u00002\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(HÁ\u0001¢\u0006\u0002\b)R \u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0010\n\u0002\u0010\u0012\u0012\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0013\u0010\u000f\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0016\u0010\u000f\u001a\u0004\b\u0017\u0010\u0018¨\u0006-"}, d2 = {"Lcom/onfido/hosted/web/module/model/CaptureSDKExternalLinkResponse;", "", "seen1", "", "url", "", "target", "Lcom/onfido/hosted/web/module/model/CaptureSDKExternalLinkResponse$LinkTarget;", "fullscreen", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Lcom/onfido/hosted/web/module/model/CaptureSDKExternalLinkResponse$LinkTarget;Ljava/lang/Boolean;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Lcom/onfido/hosted/web/module/model/CaptureSDKExternalLinkResponse$LinkTarget;Ljava/lang/Boolean;)V", "getFullscreen$annotations", "()V", "getFullscreen", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getTarget$annotations", "getTarget", "()Lcom/onfido/hosted/web/module/model/CaptureSDKExternalLinkResponse$LinkTarget;", "getUrl$annotations", "getUrl", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "(Ljava/lang/String;Lcom/onfido/hosted/web/module/model/CaptureSDKExternalLinkResponse$LinkTarget;Ljava/lang/Boolean;)Lcom/onfido/hosted/web/module/model/CaptureSDKExternalLinkResponse;", "equals", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$onfido_capture_sdk_core_release", "$serializer", "Companion", "LinkTarget", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@g
public final /* data */ class CaptureSDKExternalLinkResponse {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private final Boolean fullscreen;
    private final LinkTarget target;

    @NotNull
    private final String url;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/onfido/hosted/web/module/model/CaptureSDKExternalLinkResponse$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/onfido/hosted/web/module/model/CaptureSDKExternalLinkResponse;", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return CaptureSDKExternalLinkResponse$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0087\u0081\u0002\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0002\t\nB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\u000b"}, d2 = {"Lcom/onfido/hosted/web/module/model/CaptureSDKExternalLinkResponse$LinkTarget;", "", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "BROWSER", "OVERLAY", "$serializer", "Companion", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @g
    public static final class LinkTarget {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ LinkTarget[] $VALUES;

        @NotNull
        private static final Lazy $cachedSerializer$delegate;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE;

        @NotNull
        private final String value;
        public static final LinkTarget BROWSER = new LinkTarget("BROWSER", 0, "browser");
        public static final LinkTarget OVERLAY = new LinkTarget("OVERLAY", 1, "overlay");

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/onfido/hosted/web/module/model/CaptureSDKExternalLinkResponse$LinkTarget$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/onfido/hosted/web/module/model/CaptureSDKExternalLinkResponse$LinkTarget;", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Companion {

            /* JADX INFO: renamed from: com.onfido.hosted.web.module.model.CaptureSDKExternalLinkResponse$LinkTarget$Companion$1, reason: invalid class name */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class AnonymousClass1 extends u implements Function0<KSerializer> {
                public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

                public AnonymousClass1() {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                @NotNull
                public final KSerializer invoke() {
                    return CaptureSDKExternalLinkResponse$LinkTarget$$serializer.INSTANCE;
                }
            }

            private Companion() {
            }

            private final /* synthetic */ KSerializer get$cachedSerializer() {
                return (KSerializer) LinkTarget.$cachedSerializer$delegate.getValue();
            }

            @NotNull
            public final KSerializer serializer() {
                return get$cachedSerializer();
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        private static final /* synthetic */ LinkTarget[] $values() {
            return new LinkTarget[]{BROWSER, OVERLAY};
        }

        static {
            LinkTarget[] linkTargetArr$values = $values();
            $VALUES = linkTargetArr$values;
            $ENTRIES = s.n(linkTargetArr$values);
            INSTANCE = new Companion(null);
            $cachedSerializer$delegate = j.c(k.PUBLICATION, Companion.AnonymousClass1.INSTANCE);
        }

        private LinkTarget(String str, int i, String str2) {
            this.value = str2;
        }

        @NotNull
        public static EnumEntries getEntries() {
            return $ENTRIES;
        }

        public static LinkTarget valueOf(String str) {
            return (LinkTarget) Enum.valueOf(LinkTarget.class, str);
        }

        public static LinkTarget[] values() {
            return (LinkTarget[]) $VALUES.clone();
        }

        @NotNull
        public final String getValue() {
            return this.value;
        }
    }

    @d
    public /* synthetic */ CaptureSDKExternalLinkResponse(int i, String str, LinkTarget linkTarget, Boolean bool, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i & 7)) {
            j1.f(CaptureSDKExternalLinkResponse$$serializer.INSTANCE.getDescriptor(), i, 7);
            throw null;
        }
        this.url = str;
        this.target = linkTarget;
        this.fullscreen = bool;
    }

    public static /* synthetic */ CaptureSDKExternalLinkResponse copy$default(CaptureSDKExternalLinkResponse captureSDKExternalLinkResponse, String str, LinkTarget linkTarget, Boolean bool, int i, Object obj2) {
        if ((i & 1) != 0) {
            str = captureSDKExternalLinkResponse.url;
        }
        if ((i & 2) != 0) {
            linkTarget = captureSDKExternalLinkResponse.target;
        }
        if ((i & 4) != 0) {
            bool = captureSDKExternalLinkResponse.fullscreen;
        }
        return captureSDKExternalLinkResponse.copy(str, linkTarget, bool);
    }

    public static /* synthetic */ void getFullscreen$annotations() {
    }

    public static /* synthetic */ void getTarget$annotations() {
    }

    public static /* synthetic */ void getUrl$annotations() {
    }

    public static final /* synthetic */ void write$Self$onfido_capture_sdk_core_release(CaptureSDKExternalLinkResponse self, CompositeEncoder output, SerialDescriptor serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.url);
        output.encodeNullableSerializableElement(serialDesc, 1, CaptureSDKExternalLinkResponse$LinkTarget$$serializer.INSTANCE, self.target);
        output.encodeNullableSerializableElement(serialDesc, 2, h.f247648a, self.fullscreen);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final LinkTarget getTarget() {
        return this.target;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Boolean getFullscreen() {
        return this.fullscreen;
    }

    @NotNull
    public final CaptureSDKExternalLinkResponse copy(@NotNull String url2, LinkTarget target, Boolean fullscreen) {
        Intrinsics.checkNotNullParameter(url2, "url");
        return new CaptureSDKExternalLinkResponse(url2, target, fullscreen);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CaptureSDKExternalLinkResponse)) {
            return false;
        }
        CaptureSDKExternalLinkResponse captureSDKExternalLinkResponse = (CaptureSDKExternalLinkResponse) other;
        return Intrinsics.f(this.url, captureSDKExternalLinkResponse.url) && this.target == captureSDKExternalLinkResponse.target && Intrinsics.f(this.fullscreen, captureSDKExternalLinkResponse.fullscreen);
    }

    public final Boolean getFullscreen() {
        return this.fullscreen;
    }

    public final LinkTarget getTarget() {
        return this.target;
    }

    @NotNull
    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        int iHashCode = this.url.hashCode() * 31;
        LinkTarget linkTarget = this.target;
        int iHashCode2 = (iHashCode + (linkTarget == null ? 0 : linkTarget.hashCode())) * 31;
        Boolean bool = this.fullscreen;
        return iHashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "CaptureSDKExternalLinkResponse(url=" + this.url + ", target=" + this.target + ", fullscreen=" + this.fullscreen + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public CaptureSDKExternalLinkResponse(@NotNull String url2, LinkTarget linkTarget, Boolean bool) {
        Intrinsics.checkNotNullParameter(url2, "url");
        this.url = url2;
        this.target = linkTarget;
        this.fullscreen = bool;
    }
}
