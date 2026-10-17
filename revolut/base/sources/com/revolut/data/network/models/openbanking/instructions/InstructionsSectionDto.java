package com.revolut.data.network.models.openbanking.instructions;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lg.b;
import org.jetbrains.annotations.NotNull;
import p.a;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003J/\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u001e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, d2 = {"Lcom/revolut/data/network/models/openbanking/instructions/InstructionsSectionDto;", "", "title", "", "stepsStyle", "steps", "", "Lcom/revolut/data/network/models/openbanking/instructions/SectionStepDto;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getTitle", "()Ljava/lang/String;", "getStepsStyle", "getSteps", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "retail_data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class InstructionsSectionDto {

    @b("steps")
    private final List<SectionStepDto> steps;

    @b("stepsStyle")
    @NotNull
    private final String stepsStyle;

    @b("title")
    @NotNull
    private final String title;

    public InstructionsSectionDto(@NotNull String title, @NotNull String stepsStyle, List<SectionStepDto> list) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(stepsStyle, "stepsStyle");
        this.title = title;
        this.stepsStyle = stepsStyle;
        this.steps = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ InstructionsSectionDto copy$default(InstructionsSectionDto instructionsSectionDto, String str, String str2, List list, int i, Object obj2) {
        if ((i & 1) != 0) {
            str = instructionsSectionDto.title;
        }
        if ((i & 2) != 0) {
            str2 = instructionsSectionDto.stepsStyle;
        }
        if ((i & 4) != 0) {
            list = instructionsSectionDto.steps;
        }
        return instructionsSectionDto.copy(str, str2, list);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getStepsStyle() {
        return this.stepsStyle;
    }

    public final List<SectionStepDto> component3() {
        return this.steps;
    }

    @NotNull
    public final InstructionsSectionDto copy(@NotNull String title, @NotNull String stepsStyle, List<SectionStepDto> steps) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(stepsStyle, "stepsStyle");
        return new InstructionsSectionDto(title, stepsStyle, steps);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InstructionsSectionDto)) {
            return false;
        }
        InstructionsSectionDto instructionsSectionDto = (InstructionsSectionDto) other;
        return Intrinsics.f(this.title, instructionsSectionDto.title) && Intrinsics.f(this.stepsStyle, instructionsSectionDto.stepsStyle) && Intrinsics.f(this.steps, instructionsSectionDto.steps);
    }

    public final List<SectionStepDto> getSteps() {
        return this.steps;
    }

    @NotNull
    public final String getStepsStyle() {
        return this.stepsStyle;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iC = a.c(this.title.hashCode() * 31, 31, this.stepsStyle);
        List<SectionStepDto> list = this.steps;
        return iC + (list == null ? 0 : list.hashCode());
    }
}
