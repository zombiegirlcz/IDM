package com.revolut.feature.slot_manager.api.model.checklist;

import android.os.Parcelable;
import com.revolut.feature.slot_manager.api.model.checklist.SlotChecklistHeaderAsset;
import com.revolut.feature.slot_manager.api.model.checklist.SlotChecklistHeaderProgress;
import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.p0;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;
import rlm.g;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/slot_manager/api/model/checklist/SlotChecklistHeader;", "Landroid/os/Parcelable;", "Companion", "a", "Lcom/revolut/feature/slot_manager/api/model/checklist/SlotChecklistHeaderAsset;", "Lcom/revolut/feature/slot_manager/api/model/checklist/SlotChecklistHeaderProgress;", "feature_slot_manager_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@g(discriminator = "type")
@mlm.g
public interface SlotChecklistHeader extends Parcelable {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.f87300a;

    /* JADX INFO: renamed from: com.revolut.feature.slot_manager.api.model.checklist.SlotChecklistHeader$a, reason: from kotlin metadata */
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Companion f87300a = new Companion();

        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            p0 p0Var = o0.f186429a;
            KClass kClassB = p0Var.b(SlotChecklistHeader.class);
            KClass[] kClassArr = {p0Var.b(SlotChecklistHeaderAsset.class), p0Var.b(SlotChecklistHeaderProgress.class)};
            KSerializer[] kSerializerArr = {SlotChecklistHeaderAsset.a.f87308a, SlotChecklistHeaderProgress.a.f87316a};
            Intrinsics.checkNotNullParameter("type", "discriminator");
            return new mlm.f("com.revolut.feature.slot_manager.api.model.checklist.SlotChecklistHeader", kClassB, kClassArr, kSerializerArr, new Annotation[]{new c()});
        }
    }
}
