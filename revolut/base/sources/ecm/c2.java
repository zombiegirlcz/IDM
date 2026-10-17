package ecm;

import com.google.common.base.MoreObjects;
import com.google.common.base.Preconditions;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public final class c2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f124787a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f124788b;

    public c2(ao.h hVar) {
        String str = (String) hVar.f7847b;
        this.f124787a = str;
        ArrayList<p1> arrayList = (ArrayList) hVar.f7848c;
        HashSet hashSet = new HashSet(arrayList.size());
        for (p1 p1Var : arrayList) {
            Preconditions.checkNotNull(p1Var, "method");
            String str2 = p1Var.f124858c;
            String str3 = p1Var.f124857b;
            Preconditions.checkArgument(str.equals(str2), "service names %s != %s", str2, str);
            Preconditions.checkArgument(hashSet.add(str3), "duplicate name %s", str3);
        }
        this.f124788b = Collections.unmodifiableList(new ArrayList(arrayList));
    }

    public final String toString() {
        return MoreObjects.toStringHelper(this).add("name", this.f124787a).add("schemaDescriptor", (Object) null).add("methods", this.f124788b).omitNullValues().toString();
    }
}
