package com.fourthline.orca.internal;

import com.fourthline.orca.internal.ab0;
import com.fourthline.orca.internal.je;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class vz implements le, z90 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f34478b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f34479c;
    private final String d;
    private final String e;
    private final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final je.a.InterfaceC0222a f34480g;

    public vz(String identifier, int i, String alias, String fileName, String workflowId, je.a.InterfaceC0222a data) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        Intrinsics.checkNotNullParameter(alias, "alias");
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        Intrinsics.checkNotNullParameter(workflowId, "workflowId");
        Intrinsics.checkNotNullParameter(data, "data");
        this.f34478b = identifier;
        this.f34479c = i;
        this.d = alias;
        this.e = fileName;
        this.f = workflowId;
        this.f34480g = data;
    }

    @Override // com.fourthline.orca.internal.le
    public String a() {
        return this.f34478b;
    }

    @Override // com.fourthline.orca.internal.le
    public int b() {
        return this.f34479c;
    }

    @Override // com.fourthline.orca.internal.z90
    public ab0 c() {
        List listA = zb1.a(this.f34480g, this.e);
        return new ab0.c(this.d, "/v1/data/" + this.f, bx.g(), null, listA, 8, null);
    }

    @Override // com.fourthline.orca.internal.le
    public /* bridge */ boolean d() {
        return super.d();
    }

    public /* synthetic */ vz(String str, int i, String str2, String str3, String str4, je.a.InterfaceC0222a interfaceC0222a, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i2 & 2) != 0 ? 2 : i, (i2 & 4) != 0 ? "workflow_device_data_collection" : str2, str3, str4, interfaceC0222a);
    }
}
