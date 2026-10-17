package com.revolut.data.network.models.budgeting;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lg.b;
import org.jetbrains.annotations.NotNull;
import p.a;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J1\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0019"}, d2 = {"Lcom/revolut/data/network/models/budgeting/CustomCategoryDto;", "", "id", "", "name", "logo", "color", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getName", "getLogo", "getColor", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "retail_data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CustomCategoryDto {

    @b("color")
    @NotNull
    private final String color;

    @b("id")
    @NotNull
    private final String id;

    @b("logo")
    @NotNull
    private final String logo;

    @b("name")
    @NotNull
    private final String name;

    public CustomCategoryDto(@NotNull String id10, @NotNull String name, @NotNull String logo, @NotNull String color) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(logo, "logo");
        Intrinsics.checkNotNullParameter(color, "color");
        this.id = id10;
        this.name = name;
        this.logo = logo;
        this.color = color;
    }

    public static /* synthetic */ CustomCategoryDto copy$default(CustomCategoryDto customCategoryDto, String str, String str2, String str3, String str4, int i, Object obj2) {
        if ((i & 1) != 0) {
            str = customCategoryDto.id;
        }
        if ((i & 2) != 0) {
            str2 = customCategoryDto.name;
        }
        if ((i & 4) != 0) {
            str3 = customCategoryDto.logo;
        }
        if ((i & 8) != 0) {
            str4 = customCategoryDto.color;
        }
        return customCategoryDto.copy(str, str2, str3, str4);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getLogo() {
        return this.logo;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getColor() {
        return this.color;
    }

    @NotNull
    public final CustomCategoryDto copy(@NotNull String id10, @NotNull String name, @NotNull String logo, @NotNull String color) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(logo, "logo");
        Intrinsics.checkNotNullParameter(color, "color");
        return new CustomCategoryDto(id10, name, logo, color);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CustomCategoryDto)) {
            return false;
        }
        CustomCategoryDto customCategoryDto = (CustomCategoryDto) other;
        return Intrinsics.f(this.id, customCategoryDto.id) && Intrinsics.f(this.name, customCategoryDto.name) && Intrinsics.f(this.logo, customCategoryDto.logo) && Intrinsics.f(this.color, customCategoryDto.color);
    }

    @NotNull
    public final String getColor() {
        return this.color;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    @NotNull
    public final String getLogo() {
        return this.logo;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        return this.color.hashCode() + a.c(a.c(this.id.hashCode() * 31, 31, this.name), 31, this.logo);
    }
}
