package com.revolut.feature.slot_manager.impl.ui.screen.checklist;

import com.revolut.feature.slot_manager.api.model.checklist.SlotChecklistData;
import com.revolut.feature.slot_manager.api.model.checklist.SlotChecklistFetchConfig;
import com.revolut.feature.slot_manager.api.model.checklist.SlotChecklistPayload;
import java.time.Duration;
import java.time.Instant;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import l80.e;
import l80.f;
import lld.v;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class b {

    @NotNull
    private static final v Companion = new v();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f87373a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile boolean f87374b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ConcurrentHashMap f87375c;

    public b(e dateProvider) {
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        this.f87373a = dateProvider;
        this.f87375c = new ConcurrentHashMap();
    }

    public final boolean a(SlotChecklistPayload slotChecklistPayload) {
        Intrinsics.checkNotNullParameter(slotChecklistPayload, "slotChecklistPayload");
        if (this.f87374b) {
            return false;
        }
        if (!(slotChecklistPayload instanceof SlotChecklistData)) {
            if (slotChecklistPayload instanceof SlotChecklistFetchConfig) {
                return true;
            }
            throw new NoWhenBranchMatchedException();
        }
        SlotChecklistData slotChecklistData = (SlotChecklistData) slotChecklistPayload;
        ConcurrentHashMap concurrentHashMap = this.f87375c;
        SlotsChecklistVisibilityTracker$ChecklistDisplayRecord slotsChecklistVisibilityTracker$ChecklistDisplayRecord = (SlotsChecklistVisibilityTracker$ChecklistDisplayRecord) concurrentHashMap.get(slotChecklistData.f87295b);
        if (slotsChecklistVisibilityTracker$ChecklistDisplayRecord != null) {
            if (Duration.between(Instant.ofEpochMilli(slotsChecklistVisibilityTracker$ChecklistDisplayRecord.f87363a), ((f) this.f87373a).b()).toHours() >= 12) {
                concurrentHashMap.remove(slotChecklistData.f87295b);
                return true;
            }
            if (slotsChecklistVisibilityTracker$ChecklistDisplayRecord.f87364b == slotChecklistData.hashCode()) {
                return false;
            }
        }
        return true;
    }
}
