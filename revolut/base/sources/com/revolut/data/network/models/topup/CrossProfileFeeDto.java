package com.revolut.data.network.models.topup;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lg.b;
import org.jetbrains.annotations.NotNull;
import p.a;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/revolut/data/network/models/topup/CrossProfileFeeDto;", "", "title", "", "description", "targetCountry", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "getDescription", "getTargetCountry", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "feature_topup_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CrossProfileFeeDto {

    @b("description")
    @NotNull
    private final String description;

    @b("targetCountry")
    @NotNull
    private final String targetCountry;

    @b("title")
    @NotNull
    private final String title;

    public CrossProfileFeeDto(@NotNull String title, @NotNull String description, @NotNull String targetCountry) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(targetCountry, "targetCountry");
        this.title = title;
        this.description = description;
        this.targetCountry = targetCountry;
    }

    public static /* synthetic */ CrossProfileFeeDto copy$default(CrossProfileFeeDto crossProfileFeeDto, String str, String str2, String str3, int i, Object obj2) {
        if ((i & 1) != 0) {
            str = crossProfileFeeDto.title;
        }
        if ((i & 2) != 0) {
            str2 = crossProfileFeeDto.description;
        }
        if ((i & 4) != 0) {
            str3 = crossProfileFeeDto.targetCountry;
        }
        return crossProfileFeeDto.copy(str, str2, str3);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getTargetCountry() {
        return this.targetCountry;
    }

    @NotNull
    public final CrossProfileFeeDto copy(@NotNull String title, @NotNull String description, @NotNull String targetCountry) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(targetCountry, "targetCountry");
        return new CrossProfileFeeDto(title, description, targetCountry);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CrossProfileFeeDto)) {
            return false;
        }
        CrossProfileFeeDto crossProfileFeeDto = (CrossProfileFeeDto) other;
        return Intrinsics.f(this.title, crossProfileFeeDto.title) && Intrinsics.f(this.description, crossProfileFeeDto.description) && Intrinsics.f(this.targetCountry, crossProfileFeeDto.targetCountry);
    }

    @NotNull
    public final String getDescription() {
        return this.description;
    }

    @NotNull
    public final String getTargetCountry() {
        return this.targetCountry;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return this.targetCountry.hashCode() + a.c(this.title.hashCode() * 31, 31, this.description);
    }
}
