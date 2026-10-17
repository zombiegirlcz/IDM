package kr9;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.payments.groups.impl.ui_new.group_details_settings_name.GroupSettingsNameContract$InputData;
import java.util.Set;
import jm4.o3;

/* JADX INFO: loaded from: classes5.dex */
public final class s implements sji.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final GroupSettingsNameContract$InputData f188794a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f188795b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f188796c;
    public final e4m.e d;

    public s(l lVar, GroupSettingsNameContract$InputData groupSettingsNameContract$InputData) {
        this.f188795b = lVar;
        this.f188794a = groupSettingsNameContract$InputData;
        int i = 22;
        this.f188796c = e4m.b.b(new o3(this, 1, i));
        this.d = e4m.b.b(new o3(this, 0, i));
    }

    @Override // sji.b
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // sji.b
    public final Set g() {
        return ImmutableSet.of();
    }
}
