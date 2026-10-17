package com.revolut.data.database.models.creditor;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lg.b;
import org.jetbrains.annotations.NotNull;
import p.a;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J5\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0019"}, d2 = {"Lcom/revolut/data/database/models/creditor/CreditorEmbeddedEntity;", "", "id", "", "name", "logo", "bgColor", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getName", "getLogo", "getBgColor", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "retail_data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CreditorEmbeddedEntity {

    @b("bgColor")
    private final String bgColor;

    @b("id")
    @NotNull
    private final String id;

    @b("logo")
    private final String logo;

    @b("name")
    @NotNull
    private final String name;

    public CreditorEmbeddedEntity(@NotNull String id10, @NotNull String name, String str, String str2) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        this.id = id10;
        this.name = name;
        this.logo = str;
        this.bgColor = str2;
    }

    public static /* synthetic */ CreditorEmbeddedEntity copy$default(CreditorEmbeddedEntity creditorEmbeddedEntity, String str, String str2, String str3, String str4, int i, Object obj2) {
        if ((i & 1) != 0) {
            str = creditorEmbeddedEntity.id;
        }
        if ((i & 2) != 0) {
            str2 = creditorEmbeddedEntity.name;
        }
        if ((i & 4) != 0) {
            str3 = creditorEmbeddedEntity.logo;
        }
        if ((i & 8) != 0) {
            str4 = creditorEmbeddedEntity.bgColor;
        }
        return creditorEmbeddedEntity.copy(str, str2, str3, str4);
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

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getLogo() {
        return this.logo;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getBgColor() {
        return this.bgColor;
    }

    @NotNull
    public final CreditorEmbeddedEntity copy(@NotNull String id10, @NotNull String name, String logo, String bgColor) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        return new CreditorEmbeddedEntity(id10, name, logo, bgColor);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CreditorEmbeddedEntity)) {
            return false;
        }
        CreditorEmbeddedEntity creditorEmbeddedEntity = (CreditorEmbeddedEntity) other;
        return Intrinsics.f(this.id, creditorEmbeddedEntity.id) && Intrinsics.f(this.name, creditorEmbeddedEntity.name) && Intrinsics.f(this.logo, creditorEmbeddedEntity.logo) && Intrinsics.f(this.bgColor, creditorEmbeddedEntity.bgColor);
    }

    public final String getBgColor() {
        return this.bgColor;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    public final String getLogo() {
        return this.logo;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        int iC = a.c(this.id.hashCode() * 31, 31, this.name);
        String str = this.logo;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.bgColor;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }
}
