package olm;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import zhm.f0;

/* JADX INFO: loaded from: classes14.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f226461a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List f226462b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f226463c;
    public final HashSet d;
    public final ArrayList e;
    public final ArrayList f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayList f226464g;

    public a(String serialName) {
        Intrinsics.checkNotNullParameter(serialName, "serialName");
        this.f226461a = serialName;
        this.f226462b = f0.f322471a;
        this.f226463c = new ArrayList();
        this.d = new HashSet();
        this.e = new ArrayList();
        this.f = new ArrayList();
        this.f226464g = new ArrayList();
    }

    public final void a(String elementName, SerialDescriptor descriptor, List annotations, boolean z) {
        Intrinsics.checkNotNullParameter(elementName, "elementName");
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(annotations, "annotations");
        if (!this.d.add(elementName)) {
            StringBuilder sbX = com.google.android.gms.internal.mlkit_vision_face.a.x("Element with name '", elementName, "' is already registered in ");
            sbX.append(this.f226461a);
            throw new IllegalArgumentException(sbX.toString().toString());
        }
        this.f226463c.add(elementName);
        this.e.add(descriptor);
        this.f.add(annotations);
        this.f226464g.add(Boolean.valueOf(z));
    }

    public final ArrayList b() {
        return this.f226463c;
    }

    public final void c(List list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.f226462b = list;
    }
}
