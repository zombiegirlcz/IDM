package com.fourthline.vision.document;

import com.fourthline.core.CountryNetworkModel;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ,\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\nJ\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\nR\u001f\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\f¨\u0006\u001d"}, d2 = {"Lcom/fourthline/vision/document/DocumentValidationConfig;", "", "", "minPersonAge", "", "Lcom/fourthline/core/CountryNetworkModel;", "supportedCountries", "<init>", "(ILjava/util/List;)V", "component1", "()I", "component2", "()Ljava/util/List;", "copy", "(ILjava/util/List;)Lcom/fourthline/vision/document/DocumentValidationConfig;", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "getMinPersonAge", "b", "Ljava/util/List;", "getSupportedCountries", "fourthline-vision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class DocumentValidationConfig {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int minPersonAge;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final List supportedCountries;

    /* JADX WARN: Multi-variable type inference failed */
    public DocumentValidationConfig() {
        this(0, null, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DocumentValidationConfig copy$default(DocumentValidationConfig documentValidationConfig, int i, List list, int i2, Object obj2) {
        if ((i2 & 1) != 0) {
            i = documentValidationConfig.minPersonAge;
        }
        if ((i2 & 2) != 0) {
            list = documentValidationConfig.supportedCountries;
        }
        return documentValidationConfig.copy(i, list);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getMinPersonAge() {
        return this.minPersonAge;
    }

    public final List<CountryNetworkModel> component2() {
        return this.supportedCountries;
    }

    @NotNull
    public final DocumentValidationConfig copy(int minPersonAge, List<CountryNetworkModel> supportedCountries) {
        return new DocumentValidationConfig(minPersonAge, supportedCountries);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DocumentValidationConfig)) {
            return false;
        }
        DocumentValidationConfig documentValidationConfig = (DocumentValidationConfig) other;
        return this.minPersonAge == documentValidationConfig.minPersonAge && Intrinsics.f(this.supportedCountries, documentValidationConfig.supportedCountries);
    }

    public final int getMinPersonAge() {
        return this.minPersonAge;
    }

    public final List<CountryNetworkModel> getSupportedCountries() {
        return this.supportedCountries;
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.minPersonAge) * 31;
        List list = this.supportedCountries;
        return iHashCode + (list == null ? 0 : list.hashCode());
    }

    @NotNull
    public String toString() {
        return "DocumentValidationConfig(minPersonAge=" + this.minPersonAge + ", supportedCountries=" + this.supportedCountries + ")";
    }

    public DocumentValidationConfig(int i, List<CountryNetworkModel> list) {
        this.minPersonAge = i;
        this.supportedCountries = list;
    }

    public /* synthetic */ DocumentValidationConfig(int i, List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 18 : i, (i2 & 2) != 0 ? null : list);
    }
}
