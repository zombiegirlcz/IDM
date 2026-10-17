package sim;

import ch.qos.logback.core.CoreConstants;
import kotlin.jvm.internal.Intrinsics;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes14.dex */
public final class b implements ReadWriteProperty {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f263667a;

    @Override // sim.d
    public final Object getValue(Object obj2, KProperty property) {
        Intrinsics.checkNotNullParameter(property, "property");
        Object obj3 = this.f263667a;
        if (obj3 != null) {
            return obj3;
        }
        throw new IllegalStateException("Property " + property.getName() + " should be initialized before get.");
    }

    @Override // kotlin.properties.ReadWriteProperty
    public final void setValue(Object obj2, KProperty property, Object value) {
        Intrinsics.checkNotNullParameter(property, "property");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f263667a = value;
    }

    public final String toString() {
        String str;
        StringBuilder sb6 = new StringBuilder("NotNullProperty(");
        if (this.f263667a != null) {
            str = "value=" + this.f263667a;
        } else {
            str = "value not initialized yet";
        }
        return j6.a.u(sb6, str, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }
}
