package sim;

import ch.qos.logback.core.CoreConstants;
import kotlin.jvm.internal.Intrinsics;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public abstract class c implements ReadWriteProperty {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f263668a;

    public c(Object obj2) {
        this.f263668a = obj2;
    }

    public void a(Object obj2, KProperty property, Object obj3) {
        Intrinsics.checkNotNullParameter(property, "property");
    }

    public void b(KProperty property) {
        Intrinsics.checkNotNullParameter(property, "property");
    }

    @Override // sim.d
    public Object getValue(Object obj2, @NotNull KProperty property) {
        Intrinsics.checkNotNullParameter(property, "property");
        return this.f263668a;
    }

    @Override // kotlin.properties.ReadWriteProperty
    public void setValue(Object obj2, @NotNull KProperty property, Object obj3) {
        Intrinsics.checkNotNullParameter(property, "property");
        Object obj4 = this.f263668a;
        b(property);
        this.f263668a = obj3;
        a(obj4, property, obj3);
    }

    @NotNull
    public String toString() {
        return "ObservableProperty(value=" + this.f263668a + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
