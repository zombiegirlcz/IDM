package com.revolut.biometric_verification.impl.data.db;

import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenDelegateMarker;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import zq.a;
import zq.c;
import zq.e;

/* JADX INFO: loaded from: classes17.dex */
public final class BiometricVerificationDatabase_Impl extends BiometricVerificationDatabase {
    public static final /* synthetic */ int k = 0;
    public volatile e f;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public volatile a f50465j;

    @Override // androidx.room.RoomDatabase
    public final void clearAllTables() {
        performClear(false, "biometric_verification_deffered_upload_token", "biometric_verification_deffered_upload_metadata");
    }

    @Override // androidx.room.RoomDatabase
    public final InvalidationTracker createInvalidationTracker() {
        return new InvalidationTracker(this, new HashMap(0), new HashMap(0), "biometric_verification_deffered_upload_token", "biometric_verification_deffered_upload_metadata");
    }

    @Override // androidx.room.RoomDatabase
    public final RoomOpenDelegateMarker createOpenDelegate() {
        return new yq.a(this);
    }

    @Override // com.revolut.biometric_verification.impl.data.db.BiometricVerificationDatabase
    public final a g() {
        a aVar;
        if (this.f50465j != null) {
            return this.f50465j;
        }
        synchronized (this) {
            try {
                if (this.f50465j == null) {
                    this.f50465j = new a(this);
                }
                aVar = this.f50465j;
            } catch (Throwable th10) {
                throw th10;
            }
        }
        return aVar;
    }

    @Override // androidx.room.RoomDatabase
    public final List getAutoMigrations(Map map) {
        return new ArrayList();
    }

    @Override // androidx.room.RoomDatabase
    public final Set getRequiredAutoMigrationSpecs() {
        return new HashSet();
    }

    @Override // androidx.room.RoomDatabase
    public final Map getRequiredTypeConverters() {
        HashMap map = new HashMap();
        List list = Collections.EMPTY_LIST;
        map.put(c.class, list);
        map.put(a.class, list);
        return map;
    }

    @Override // com.revolut.biometric_verification.impl.data.db.BiometricVerificationDatabase
    public final c h() {
        e eVar;
        if (this.f != null) {
            return this.f;
        }
        synchronized (this) {
            try {
                if (this.f == null) {
                    this.f = new e(this);
                }
                eVar = this.f;
            } catch (Throwable th10) {
                throw th10;
            }
        }
        return eVar;
    }
}
