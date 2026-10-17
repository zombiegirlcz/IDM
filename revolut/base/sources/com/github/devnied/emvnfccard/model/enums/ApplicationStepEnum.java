package com.github.devnied.emvnfccard.model.enums;

import com.github.devnied.emvnfccard.model.Application;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public enum ApplicationStepEnum implements IKeyEnum {
    NOT_SELECTED(0),
    SELECTED(1),
    READ(2);

    private int key;

    ApplicationStepEnum(int i) {
        this.key = i;
    }

    public static boolean isAtLeast(List<Application> list, ApplicationStepEnum applicationStepEnum) {
        boolean z = false;
        if (list != null && applicationStepEnum != null) {
            for (Application application : list) {
                if (application != null && application.getReadingStep() != null && application.getReadingStep().key >= applicationStepEnum.getKey()) {
                    z = true;
                }
            }
        }
        return z;
    }

    @Override // com.github.devnied.emvnfccard.model.enums.IKeyEnum
    public int getKey() {
        return this.key;
    }
}
