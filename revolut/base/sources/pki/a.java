package pki;

import android.content.Intent;
import kotlin.jvm.internal.Intrinsics;
import oki.d;
import os2.g;
import yii.c;
import yji.r;

/* JADX INFO: loaded from: classes10.dex */
public interface a extends r {
    default void J() {
    }

    default void J0(boolean z) {
    }

    void J1(g gVar);

    default void L1(c stateStorage) {
        Intrinsics.checkNotNullParameter(stateStorage, "stateStorage");
    }

    default void R0() {
    }

    default void W() {
    }

    default void b0(c stateStorage) {
        Intrinsics.checkNotNullParameter(stateStorage, "stateStorage");
    }

    default void c2() {
    }

    void e0(g gVar);

    default void g1(boolean z) {
    }

    default void i1(boolean z) {
    }

    default boolean l0(boolean z) {
        return false;
    }

    default void n() {
    }

    default void o(int i, String[] permissions, int[] grantResults) {
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        Intrinsics.checkNotNullParameter(grantResults, "grantResults");
    }

    default void onActivityResult(int i, int i2, Intent intent) {
    }

    default void onCreate() {
    }

    default void onDestroy() {
    }

    default void u(boolean z) {
    }

    default boolean u1(d defaultHandler) {
        Intrinsics.checkNotNullParameter(defaultHandler, "defaultHandler");
        return ((Boolean) defaultHandler.invoke()).booleanValue();
    }

    default void z() {
    }
}
