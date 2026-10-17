package gsh;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\r\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\fR(\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u000f\u001a\u0004\b\u0005\u0010\u0010¨\u0006\u0012"}, d2 = {"Lgsh/a;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "c", "widgetType", "Ldsh/t;", "b", "Ldsh/t;", "()Ldsh/t;", "state", "", "Ljava/util/Map;", "()Ljava/util/Map;", "config", "feature_widgets_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("widgetType")
    @NotNull
    private final String widgetType;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("state")
    private final dsh.t state;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("config")
    private final Map<String, String> config;

    public a(String widgetType, dsh.t tVar, Map map) {
        Intrinsics.checkNotNullParameter(widgetType, "widgetType");
        this.widgetType = widgetType;
        this.state = tVar;
        this.config = map;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Map getConfig() {
        return this.config;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final dsh.t getState() {
        return this.state;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getWidgetType() {
        return this.widgetType;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.widgetType, aVar.widgetType) && this.state == aVar.state && Intrinsics.f(this.config, aVar.config);
    }

    public final int hashCode() {
        int iHashCode = this.widgetType.hashCode() * 31;
        dsh.t tVar = this.state;
        int iHashCode2 = (iHashCode + (tVar == null ? 0 : tVar.hashCode())) * 31;
        Map<String, String> map = this.config;
        return iHashCode2 + (map != null ? map.hashCode() : 0);
    }
}
