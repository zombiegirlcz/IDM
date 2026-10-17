package androidx.core.backported.fixes;

import aim.e;
import aim.f;
import aim.o;
import ch.qos.logback.core.CoreConstants;
import java.util.BitSet;
import java.util.Iterator;
import java.util.Set;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import o10.c;
import org.jetbrains.annotations.NotNull;
import yhm.j;
import zhm.h0;
import zhm.u;
import zhm.y0;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0016\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u000e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0002J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\b\u0010\u0014\u001a\u00020\u0013H\u0002R!\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\b¨\u0006\u0015"}, d2 = {"Landroidx/core/backported/fixes/SystemPropertyResolver;", "Landroidx/core/backported/fixes/StatusResolver;", "<init>", "()V", "aliases", "", "", "getAliases", "()Ljava/util/Set;", "aliases$delegate", "Lkotlin/Lazy;", "getStatus", "Landroidx/core/backported/fixes/Status;", "ki", "Landroidx/core/backported/fixes/KnownIssue;", "initAliases", "parseLongListString", "", "s", "", "getAliasBitsetString", "core-backported-fixes"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SystemPropertyResolver implements StatusResolver {

    /* JADX INFO: renamed from: aliases$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy aliases = j.b(new c(this, 2));

    private final String getAliasBitsetString() {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            Object objInvoke = cls.getMethod("get", String.class, String.class).invoke(cls, "ro.build.backported_fixes.alias_bitset.long_list", "");
            Intrinsics.i(objInvoke, "null cannot be cast to non-null type kotlin.String");
            return (String) objInvoke;
        } catch (Exception unused) {
            return "";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Set<Integer> initAliases() {
        BitSet bitSetValueOf = BitSet.valueOf(parseLongListString(getAliasBitsetString()));
        int size = bitSetValueOf.size();
        if (size == 0) {
            return h0.f322473a;
        }
        o oVar = new o(new f(size));
        for (int iNextSetBit = 0; iNextSetBit >= 0; iNextSetBit = bitSetValueOf.nextSetBit(iNextSetBit + 1)) {
            if (bitSetValueOf.get(iNextSetBit)) {
                oVar.add(Integer.valueOf(iNextSetBit));
            }
            if (iNextSetBit == Integer.MAX_VALUE) {
                break;
            }
        }
        return y0.a(oVar);
    }

    private final long[] parseLongListString(String s2) {
        e eVarB = u.b();
        Iterator it8 = d0.m0(s2, new char[]{CoreConstants.COMMA_CHAR}, 6).iterator();
        while (it8.hasNext()) {
            try {
                eVarB.add(Long.valueOf(Long.parseLong((String) it8.next())));
            } catch (NumberFormatException unused) {
            }
        }
        return zhm.d0.e1(u.a(eVarB));
    }

    @NotNull
    public final Set<Integer> getAliases() {
        return (Set) this.aliases.getValue();
    }

    @Override // androidx.core.backported.fixes.StatusResolver
    @NotNull
    public Status getStatus(@NotNull KnownIssue ki) {
        Intrinsics.checkNotNullParameter(ki, "ki");
        return ki.getAlias() == null ? Status.Unknown : getAliases().contains(ki.getAlias()) ? Status.Fixed : Status.NotFixed;
    }
}
