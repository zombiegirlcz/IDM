package com.fourthline.vision.internal;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class ge {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Integer f36250a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final fe f36251b;

    public ge(Integer num, @NotNull fe codec) {
        Intrinsics.checkNotNullParameter(codec, "codec");
        this.f36250a = num;
        this.f36251b = codec;
    }

    public static /* synthetic */ ge copy$default(ge geVar, Integer num, fe feVar, int i, Object obj2) {
        if ((i & 1) != 0) {
            num = geVar.f36250a;
        }
        if ((i & 2) != 0) {
            feVar = geVar.f36251b;
        }
        return geVar.copy(num, feVar);
    }

    public final Integer component1() {
        return this.f36250a;
    }

    @NotNull
    public final fe component2() {
        return this.f36251b;
    }

    @NotNull
    public final ge copy(Integer num, @NotNull fe codec) {
        Intrinsics.checkNotNullParameter(codec, "codec");
        return new ge(num, codec);
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ge)) {
            return false;
        }
        ge geVar = (ge) obj2;
        return Intrinsics.f(this.f36250a, geVar.f36250a) && this.f36251b == geVar.f36251b;
    }

    @NotNull
    public final fe getCodec() {
        return this.f36251b;
    }

    public final Integer getTargetBitRate() {
        return this.f36250a;
    }

    public int hashCode() {
        Integer num = this.f36250a;
        return ((num == null ? 0 : num.hashCode()) * 31) + this.f36251b.hashCode();
    }

    @NotNull
    public String toString() {
        return "VideoConfig(targetBitRate=" + this.f36250a + ", codec=" + this.f36251b + ")";
    }

    public /* synthetic */ ge(Integer num, fe feVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, feVar);
    }
}
