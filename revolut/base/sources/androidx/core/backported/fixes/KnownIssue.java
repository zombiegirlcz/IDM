package androidx.core.backported.fixes;

import a0.d;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o23.b;
import org.jetbrains.annotations.NotNull;
import p.a;
import zhm.h0;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u001a\u0018\u00002\u00020\u0001B?\b\u0000\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\b\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010!\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010\u0014¨\u0006$"}, d2 = {"Landroidx/core/backported/fixes/KnownIssue;", "", "", "id", "", "alias", "", "", "manuallyTestedFingerprints", "Lkotlin/Function0;", "", "precondition", "<init>", "(JLjava/lang/Integer;Ljava/util/Set;Lkotlin/jvm/functions/Function0;)V", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "J", "getId", "()J", "Ljava/lang/Integer;", "getAlias$core_backported_fixes", "()Ljava/lang/Integer;", "Ljava/util/Set;", "getManuallyTestedFingerprints$core_backported_fixes", "()Ljava/util/Set;", "Lkotlin/jvm/functions/Function0;", "getPrecondition$core_backported_fixes", "()Lkotlin/jvm/functions/Function0;", "url", "Ljava/lang/String;", "getUrl", "core-backported-fixes"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class KnownIssue {
    private final Integer alias;
    private final long id;

    @NotNull
    private final Set<String> manuallyTestedFingerprints;

    @NotNull
    private final Function0<Boolean> precondition;

    @NotNull
    private final String url;

    public KnownIssue(long j2, Integer num, @NotNull Set<String> manuallyTestedFingerprints, @NotNull Function0<Boolean> precondition) {
        Intrinsics.checkNotNullParameter(manuallyTestedFingerprints, "manuallyTestedFingerprints");
        Intrinsics.checkNotNullParameter(precondition, "precondition");
        this.id = j2;
        this.alias = num;
        this.manuallyTestedFingerprints = manuallyTestedFingerprints;
        this.precondition = precondition;
        this.url = a.m(j2, "https://issuetracker.google.com/issues/");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean _init_$lambda$0() {
        return true;
    }

    public boolean equals(Object other) {
        return (other instanceof KnownIssue) && this.id == ((KnownIssue) other).id;
    }

    /* JADX INFO: renamed from: getAlias$core_backported_fixes, reason: from getter */
    public final Integer getAlias() {
        return this.alias;
    }

    @NotNull
    public final Set<String> getManuallyTestedFingerprints$core_backported_fixes() {
        return this.manuallyTestedFingerprints;
    }

    @NotNull
    public final Function0<Boolean> getPrecondition$core_backported_fixes() {
        return this.precondition;
    }

    public int hashCode() {
        return Long.hashCode(this.id);
    }

    @NotNull
    public String toString() {
        if (this.alias == null) {
            return d.j(this.id, " without alias", new StringBuilder());
        }
        return this.id + " with alias " + this.alias.intValue();
    }

    public KnownIssue(long j2, Integer num, Set set, Function0 function0, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(j2, num, (i & 4) != 0 ? h0.f322473a : set, (i & 8) != 0 ? new b(1) : function0);
    }
}
