package fv1;

import com.revolut.feature.apm.core.models.alias.Alias;
import com.revolut.feature.apm.core.models.alias.AliasAttributes;
import com.revolut.feature.apm.core.models.alias.AliasStatus;
import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import org.jetbrains.annotations.NotNull;
import wim.z;

/* JADX INFO: loaded from: classes20.dex */
public final class e {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ue0.c f138309a;

    public e(ue0.c storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.f138309a = storage;
    }

    public final void a(Alias alias) {
        Intrinsics.checkNotNullParameter(alias, "alias");
        Intrinsics.checkNotNullParameter(alias, "<this>");
        String str = alias.f61878a.f61891a;
        String str2 = alias.f61879b;
        AliasStatus aliasStatus = alias.f61880c;
        String str3 = aliasStatus.f61884a;
        AliasAttributes aliasAttributes = alias.d;
        String str4 = aliasAttributes.d;
        Boolean bool = aliasAttributes.f61882b;
        LocalDate localDate = aliasAttributes.f61883c;
        Long lValueOf = localDate != null ? Long.valueOf(oc.c.F(localDate)) : null;
        String str5 = aliasAttributes.f61881a;
        AliasStatus.OCCUPIED occupied = aliasStatus instanceof AliasStatus.OCCUPIED ? (AliasStatus.OCCUPIED) aliasStatus : null;
        this.f138309a.G(new iv1.a(str, str2, str3, str4, bool, lValueOf, str5, occupied != null ? occupied.f61889b : null), "BREB_MAIN_ALIAS_KEY", z.d(o0.b(iv1.a.class)));
    }
}
