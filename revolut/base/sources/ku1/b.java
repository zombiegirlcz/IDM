package ku1;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class b extends rm.f implements d, c {

    @NotNull
    public static final a Companion = new a(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ihm.j f189595a;

    public static final class a extends ee.b {
        public /* synthetic */ a(int i) {
            this();
        }

        private a() {
            super(new jli.f(6));
        }
    }

    public b() {
        ihm.j jVarD = ihm.b.e(Boolean.FALSE).d();
        Intrinsics.checkNotNullExpressionValue(jVarD, "toSerialized(...)");
        this.f189595a = jVarD;
    }

    @Override // rm.f, qm.a
    public final void D(Object obj2) {
        this.f189595a.onNext((Boolean) obj2);
    }

    @Override // rm.f
    public final ihm.j a() {
        return this.f189595a;
    }
}
