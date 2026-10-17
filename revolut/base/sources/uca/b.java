package uca;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.pix.api.ui.PixAliasResolveErrorDialogProvider$ActionableErrorDialogType;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f279012a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f279013b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f279014c;
    public final Integer d;
    public final PixAliasResolveErrorDialogProvider$ActionableErrorDialogType e;

    public /* synthetic */ b(TextLocalisedClause textLocalisedClause, TextLocalisedClause textLocalisedClause2, Integer num, PixAliasResolveErrorDialogProvider$ActionableErrorDialogType pixAliasResolveErrorDialogProvider$ActionableErrorDialogType, int i) {
        this(textLocalisedClause, textLocalisedClause2, (i & 4) != 0 ? null : num, (Integer) null, (i & 16) != 0 ? null : pixAliasResolveErrorDialogProvider$ActionableErrorDialogType);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f279012a, bVar.f279012a) && Intrinsics.f(this.f279013b, bVar.f279013b) && Intrinsics.f(this.f279014c, bVar.f279014c) && Intrinsics.f(this.d, bVar.d) && this.e == bVar.e;
    }

    public final int hashCode() {
        int iA = t61.a.a(this.f279012a.hashCode() * 31, 31, this.f279013b);
        Integer num = this.f279014c;
        int iHashCode = (iA + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.d;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        PixAliasResolveErrorDialogProvider$ActionableErrorDialogType pixAliasResolveErrorDialogProvider$ActionableErrorDialogType = this.e;
        return iHashCode2 + (pixAliasResolveErrorDialogProvider$ActionableErrorDialogType != null ? pixAliasResolveErrorDialogProvider$ActionableErrorDialogType.hashCode() : 0);
    }

    public b(TextLocalisedClause titleClause, TextLocalisedClause descriptionClause, Integer num, Integer num2, PixAliasResolveErrorDialogProvider$ActionableErrorDialogType pixAliasResolveErrorDialogProvider$ActionableErrorDialogType) {
        Intrinsics.checkNotNullParameter(titleClause, "titleClause");
        Intrinsics.checkNotNullParameter(descriptionClause, "descriptionClause");
        this.f279012a = titleClause;
        this.f279013b = descriptionClause;
        this.f279014c = num;
        this.d = num2;
        this.e = pixAliasResolveErrorDialogProvider$ActionableErrorDialogType;
    }
}
