package com.google.common.reflect;

import com.google.common.base.Predicate;
import com.google.common.reflect.ClassPath;

/* JADX INFO: loaded from: classes17.dex */
public final /* synthetic */ class a implements Predicate {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f49306a;

    @Override // com.google.common.base.Predicate
    public final boolean apply(Object obj2) {
        switch (this.f49306a) {
            case 0:
                return ((ClassPath.ClassInfo) obj2).isTopLevel();
            default:
                return ((Class) obj2).isInterface();
        }
    }
}
