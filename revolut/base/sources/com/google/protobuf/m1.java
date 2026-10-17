package com.google.protobuf;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public interface m1 extends List {
    Object getRaw(int i);

    List getUnderlyingElements();

    m1 getUnmodifiableView();

    void p1(p pVar);
}
