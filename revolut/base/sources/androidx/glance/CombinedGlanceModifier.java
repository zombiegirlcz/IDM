package androidx.glance;

import androidx.glance.GlanceModifier;
import j6.a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.u;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005J7\u0010\u000b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00062\u0006\u0010\u0007\u001a\u00028\u00002\u0018\u0010\n\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00028\u00000\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\u0010\u001a\u00020\u000e2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000e0\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J#\u0010\u0012\u001a\u00020\u000e2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000e0\rH\u0016¢\u0006\u0004\b\u0012\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u000e2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0002\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0002\u0010\u001dR\u0014\u0010\u0003\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001d¨\u0006\u001e"}, d2 = {"Landroidx/glance/CombinedGlanceModifier;", "Landroidx/glance/GlanceModifier;", "outer", "inner", "<init>", "(Landroidx/glance/GlanceModifier;Landroidx/glance/GlanceModifier;)V", "R", "initial", "Lkotlin/Function2;", "Landroidx/glance/GlanceModifier$Element;", "operation", "foldIn", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "Lkotlin/Function1;", "", "predicate", "any", "(Lkotlin/jvm/functions/Function1;)Z", "all", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Landroidx/glance/GlanceModifier;", "glance_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class CombinedGlanceModifier implements GlanceModifier {

    @NotNull
    private final GlanceModifier inner;

    @NotNull
    private final GlanceModifier outer;

    /* JADX INFO: renamed from: androidx.glance.CombinedGlanceModifier$toString$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "acc", "element", "Landroidx/glance/GlanceModifier$Element;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class AnonymousClass1 extends u implements Function2<String, GlanceModifier.Element, String> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        @NotNull
        public final String invoke(@NotNull String str, @NotNull GlanceModifier.Element element) {
            if (str.length() == 0) {
                return element.toString();
            }
            return str + ", " + element;
        }
    }

    public CombinedGlanceModifier(@NotNull GlanceModifier glanceModifier, @NotNull GlanceModifier glanceModifier2) {
        this.outer = glanceModifier;
        this.inner = glanceModifier2;
    }

    @Override // androidx.glance.GlanceModifier
    public boolean all(@NotNull Function1<? super GlanceModifier.Element, Boolean> predicate) {
        return this.outer.all(predicate) && this.inner.all(predicate);
    }

    @Override // androidx.glance.GlanceModifier
    public boolean any(@NotNull Function1<? super GlanceModifier.Element, Boolean> predicate) {
        return this.outer.any(predicate) || this.inner.any(predicate);
    }

    public boolean equals(Object other) {
        if (!(other instanceof CombinedGlanceModifier)) {
            return false;
        }
        CombinedGlanceModifier combinedGlanceModifier = (CombinedGlanceModifier) other;
        return Intrinsics.f(this.outer, combinedGlanceModifier.outer) && Intrinsics.f(this.inner, combinedGlanceModifier.inner);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.glance.GlanceModifier
    public <R> R foldIn(R initial, @NotNull Function2<? super R, ? super GlanceModifier.Element, ? extends R> operation) {
        return (R) this.inner.foldIn(this.outer.foldIn(initial, operation), operation);
    }

    public int hashCode() {
        return (this.inner.hashCode() * 31) + this.outer.hashCode();
    }

    @NotNull
    public String toString() {
        return a.u(new StringBuilder("["), (String) foldIn("", AnonymousClass1.INSTANCE), ']');
    }
}
